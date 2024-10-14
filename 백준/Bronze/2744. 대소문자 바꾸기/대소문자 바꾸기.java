import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        String ans = "";
        int len = word.length();

        for(int i=0; i<len; i++){
            char alphabet = word.charAt(i);
            if(alphabet < 97) // 대문자
                ans += (char)(alphabet + 32);
            else
                ans += (char)(alphabet - 32);
        }

        bw.write(ans);
        bw.flush();
        bw.close();
        br.close();
    }
}
