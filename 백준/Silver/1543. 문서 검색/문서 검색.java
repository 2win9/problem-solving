import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String document = br.readLine();
        String searchingWord = br.readLine();

        int docLength = document.length();
        int wordLength = searchingWord.length();

        int ans = 0;
        int count = 0;


        for(int i=0; i<docLength; i++){ // a baba baba - document
            boolean isMatch = true;

            for(int j=0; j<wordLength; j++){ // baba - searchWord
                if( docLength <= (i+j) || searchingWord.charAt(j) != document.charAt(i + j)  ){
                    isMatch = false;
                    break;
                }
            }

            if(isMatch){
                count ++;
                i += wordLength - 1;
            }
        }

        bw.write(Integer.toString(count));
        bw.flush();
        bw.close();
        br.close();
    }
}
