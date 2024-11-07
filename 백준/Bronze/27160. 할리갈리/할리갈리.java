import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        String[] S = {"STRAWBERRY", "BANANA", "LIME", "PLUM"};
        int[] countS = new int[4];

        for(int i=0; i<N; i++){
            String[] nums = br.readLine().split(" ");

            if(nums[0].equals("STRAWBERRY")){
                countS[0] += Integer.parseInt(nums[1]);
            }else if(nums[0].equals("BANANA")){
                countS[1] += Integer.parseInt(nums[1]);
            }else if(nums[0].equals("LIME")){
                countS[2] += Integer.parseInt(nums[1]);
            }else{
                countS[3] += Integer.parseInt(nums[1]);
            }
        }

        boolean isFive = false;

        for(int i=0; i<4; i++){
            if(countS[i] == 5){
                System.out.print("YES");
                isFive = true;
                break;
            }
        }

        if(!isFive){
            System.out.print("NO");
        }

    }
}
