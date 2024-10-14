import java.io.*;

public class Main {
    public static int ALPHABET_COUNT = 26;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String firstWord = br.readLine();
        String secondWord = br.readLine();
        int ans = 0;

        int[] firstWords = new int[ALPHABET_COUNT];
        int[] secondWords = new int[ALPHABET_COUNT];

        int firstWordLength = firstWord.length();
        int secondWordLength = secondWord.length();

        for(int i=0; i<firstWordLength; i++)
            firstWords[firstWord.charAt(i) - 97]++;

        for(int i=0; i<secondWordLength; i++)
            secondWords[secondWord.charAt(i) - 97]++;

        for(int i=0; i<ALPHABET_COUNT; i++){
            ans += Math.abs(firstWords[i] - secondWords[i]);
        }

        bw.write(Integer.toString(ans));
        bw.flush();
        bw.close();
        br.close();
    }
}

// 1. 단어 1의 알파벳 구성원소 개수 배열을 구한다.
// 2. 단어 2의 알파벳 구성원소 개수 배열을 구한다.
// 3. 각 배열 구성원소의 차를 모두 더한다.