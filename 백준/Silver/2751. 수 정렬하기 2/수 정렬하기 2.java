import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        //int[] arr = new int[N];

        /* Primitive[] sort
         Dual-Pivot Quick Sort
         O(n^2) */


        Integer[] arr = new Integer[N];

        /* Object[] sort
         Tim Sort
         O(nlogn) */


        for(int i=0; i<N; i++){
            int n = Integer.parseInt(br.readLine());
            arr[i] = n;
        }

        // 오름차순 정렬
        Arrays.sort(arr);

        // 출력
        for(int n : arr){
            bw.write(String.valueOf(n));
            bw.newLine();
        }

        bw.flush();
        bw.close();
        br.close();

    }
}
