import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] nums = br.readLine().split(" ");
        String N = nums[0]; // ZZZZZ
        int B = Integer.parseInt(nums[1]); // 36진법

        int ans = 0;
        int idx = N.length() - 1;
        int exp = 0;

        for(int i=idx; i>=0; i--){
            if(N.charAt(i) >= 65){ // 문자가 알파벳이면
                ans += (N.charAt(i) - 'A' + 10) * Math.pow(B, exp);
            }else{ // 숫자면
                ans += (N.charAt(i) - '0') * Math.pow(B, exp);
            }
            exp ++;
        }

        System.out.print(ans);
    }
}
