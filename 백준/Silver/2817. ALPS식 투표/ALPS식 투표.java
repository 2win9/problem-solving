// 1. 참가자들이 투표한다. (스태프별로 투표수를 입력받는다.)
// 2. 기준이 안되는 스태프를 후보에서 제외한다
// 3. 각 스태프들의 점수집합을 구한다.
// 4. 14개의 칩을 1~14등까지 점수의 주인(스태프)에게 하나씩 준다.

import java.io.*;

class Score{
    int staffIdx;
    double value;
    public Score(int idx, double scr){
        this.staffIdx = idx;
        this.value = scr;
    }
}

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int X = Integer.parseInt(br.readLine()); // 참가자
        int N = Integer.parseInt(br.readLine()); // 스태프

        boolean[] staffs = new boolean[26];
        double[] votes = new double[26];
        double candidateCut = X * 0.05;
        int staffCount = 0;

        // 1. 참가자들이 투표한다. (스태프별로 투표수를 입력받는다.)
        while(N-->0){
            String[] arr = br.readLine().split(" ");
            String staffName = arr[0];
            double voted = Double.parseDouble(arr[1]);

            int idx = staffName.charAt(0) - 'A';
            // 2. 기준이 안되는 스태프를 후보에서 제외한다
            if(voted >= candidateCut){
                staffs[idx] = true;
                votes[idx] = voted;
                staffCount++;
            }
        }

        // 3. 각 스태프들의 점수집합을 구한다.
        Score[] scores = new Score[staffCount * 14];

        int scoreIdx = 0;
        for(int i=0; i<26; i++){
            if(staffs[i] == true){
                for(int j=1; j<=14; j++){
                    scores[scoreIdx++] = new Score(i, votes[i]/(double)j);
                }
            }
        }
        sortScoreDes(scores); // 오름차순 정렬

        int[] chips = new int[26];

        // 4. 14개의 칩을 1~14등까지 점수의 주인(스태프)에게 하나씩 준다.
        for(int i=0; i<14; i++){
            chips[scores[i].staffIdx]++;
        }

        // 결과 출력
        for(int i=0; i<26; i++){
            if(staffs[i]){
                bw.write((char)(i + 'A'));
                bw.write(" ");
                bw.write(Integer.toString(chips[i]));
                bw.write("\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }

    public static void sortScoreDes(Score[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<i; j++){
                if(arr[i].value > arr[j].value){
                    Score temp = arr[i];

                    for(int k=i; k>j; k--){
                        arr[k] = arr[k-1];
                    }
                    arr[j] = temp;
                    break;
                }
            }
        }
    }

}
