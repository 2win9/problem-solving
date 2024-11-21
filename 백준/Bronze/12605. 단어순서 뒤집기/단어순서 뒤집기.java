import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for(int i=0; i<N; i++){
            String[] words = br.readLine().split(" ");

            System.out.print("Case #"+(i+1)+": ");
            for(int j=words.length-1; j>=0; j--){
                System.out.print(words[j]+" ");
            }
            System.out.println();

        }

    }
}
