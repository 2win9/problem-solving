import java.io.*;

public class Main {
    static final int ALPHABET_COUNT = 26;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String word = br.readLine();
        int[] alphabet = new int[ALPHABET_COUNT]; // a ~ z

        int len = word.length();
        int maxCount = 0;
        char ans = ' ';

        for(int i=0; i<len; i++){
            int idx = word.charAt(i);
            if(idx >= 97)
                idx -= 32;

            alphabet[idx - 65]++;
        }

        for(int i=0; i<ALPHABET_COUNT; i++){
            if(alphabet[i] > maxCount) {
                maxCount = alphabet[i];
                ans = (char)(i + 65);
            } else if (alphabet[i] == maxCount) {
                ans = '?';
            }
        }

        bw.write(ans);
        bw.flush();
        bw.close();
        br.close();
    }
}
