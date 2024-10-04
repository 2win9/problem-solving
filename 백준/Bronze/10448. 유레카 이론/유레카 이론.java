import java.io.*;

public class Main {

    // K보다 작은 삼각수 구해주는 함수
    public static int getTriangleNumbers(int K, int[] triangleNumbers){
        int triangleNumberCount = 0;
        for(int i=1; ; i++){
            int triangleNumber = i*(i+1)/2;
            if(triangleNumber > K){
                break;
            }
            triangleNumbers[triangleNumberCount++] = triangleNumber; // K 이하의 삼각수만 배열에 저장
        }
        return triangleNumberCount;
    }

    public static boolean isEurekaNumber(int K, int[] triangleNumbers, int triangleNumberCount){
        for(int i=0; i<triangleNumberCount; i++){
            for(int j=0; j<triangleNumberCount; j++){
                for(int k=0; k<triangleNumberCount; k++){
                    int sum = triangleNumbers[i]+triangleNumbers[j]+triangleNumbers[k];
                    if(sum == K){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int T = Integer.parseInt(br.readLine());

        while(T-- > 0){
            int K = Integer.parseInt(br.readLine());
            int[] triangleNumbers = new int[50]; // k는 1000이하 이므로
            int triangleNumberCount = getTriangleNumbers(K, triangleNumbers);
            bw.write(isEurekaNumber(K, triangleNumbers, triangleNumberCount) ? "1\n" : "0\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}