import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    // 1 <= N < 10,000,000
    // 1 <= num <= 10,000
    static final int SIZE = 10001;

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] countArr = new int[SIZE];

        for(int i=0; i<N; i++){
            int n = Integer.parseInt(br.readLine());
            countArr[n]++;
        }

        for(int i=1; i<SIZE; i++){
            while(countArr[i]-- > 0){
                bw.write(i+"\n");
            }
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
