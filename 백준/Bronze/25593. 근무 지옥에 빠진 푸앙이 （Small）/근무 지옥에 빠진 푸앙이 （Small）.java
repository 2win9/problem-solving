import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        String[] first;
        String[] second;
        String[] third;
        String[] fourth;

        // 직원들 이름
        HashMap<String, Integer> member = new HashMap<String, Integer>();

        for(int i=0; i<N; i++){
            // 일주일치 시간표 입력받기
            first = br.readLine().split(" "); // 4
            second = br.readLine().split(" "); // 6
            third = br.readLine().split(" "); // 4
            fourth = br.readLine().split(" "); // 10

            for(String x : first){
                if(x.equals("-")){
                    continue;
                }

                // 직원 이름에 들어가 있지 않으면 추가
                if(!member.containsKey(x)){
                    member.put(x, 4);
                }else{
                    member.put(x, 4+member.get(x));
                }
            }
            for(String x : second){
                if(x.equals("-")){
                    continue;
                }

                // 직원 이름에 들어가 있지 않으면 추가
                if(!member.containsKey(x)){
                    member.put(x, 6);
                }else{
                    member.put(x, 6+member.get(x));
                }
            }
            for(String x : third){
                if(x.equals("-")){
                    continue;
                }

                // 직원 이름에 들어가 있지 않으면 추가
                if(!member.containsKey(x)){
                    member.put(x, 4);
                }else{
                    member.put(x, 4+member.get(x));
                }
            }
            for(String x : fourth){
                if(x.equals("-")){
                    continue;
                }

                // 직원 이름에 들어가 있지 않으면 추가
                if(!member.containsKey(x)){
                    member.put(x, 10);
                }else{
                    member.put(x, 10+member.get(x));
                }
            }
        }


        //결과 출력
        int min = 4*7*N*10;
        int max = 0;

        for(String x : member.keySet()){
            if(min > member.get(x)){
                min = member.get(x);
            }else if(max < member.get(x)){
                max = member.get(x);
            }
        }

        if(max-min > 12){
            System.out.print("No");
        }else{
            System.out.print("Yes");
        }


    }
}
