import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        String[] nums = br.readLine().split(" ");
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(nums[i]);
        }

        int x = Integer.parseInt(br.readLine());

        int countArr[] = new int[1000001]; // 1,000,000

        for(int i=0; i<n; i++){
            countArr[arr[i]]++;
        }

        int cnt = 0;


        for(int i=1; i<=(x-1)/2; i++){
            if(x-i <= 1000000){
                if(countArr[i]>0 && countArr[x-i]>0){
                    cnt++;
                }
            }
        }


        bw.write(Integer.toString(cnt));
        bw.flush();
        bw.close();
        br.close();
    }
}
