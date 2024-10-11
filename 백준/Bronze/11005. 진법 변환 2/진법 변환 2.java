import java.io.*;

// [11005] 진법 변환 2
public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] nums = br.readLine().split(" ");
        int N = Integer.parseInt(nums[0]); // N <= 1,000,000,000, ex) 100
        int B = Integer.parseInt(nums[1]); // 2 <= B <= 36, ex) 3

        int basePower = 1;
        int K = 0;

        while((long) basePower * B <= N){
            basePower *= B;
            K++;
        }

        int[] arr = new int[K+1];

        for(int i=K; i>=0; i--){
            if(basePower == 1){
                arr[i] = N;
            }else{
                arr[i] = N / basePower;
                N %= basePower;
                basePower /= B;
            }
        }

        // 출력
        for(int i=K; i>=0; i--){
            if(arr[i]<10){
                bw.write(Integer.toString(arr[i]));
            }else{
                bw.write((char)'A' - 10 + arr[i]);
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
