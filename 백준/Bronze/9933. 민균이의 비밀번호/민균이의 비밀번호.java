import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        HashSet<String> words = new HashSet<>();
        String ans = "";

        for(int i=0; i<N; i++){
            String word = sc.next();
            words.add(word);
        }

        for(String word : words){
            for(String revWord : words){
                if(getReverseWord(word).equals(revWord)){
                    ans = word;
                    break;
                }
            }
        }

        //결과 출력
        System.out.print(ans.length()+" "+ans.charAt(ans.length()/2));

    }

    public static String getReverseWord(String s){

        int len = s.length();
        String reverseWord = "";

        for(int i=len-1; i>=0; i--){
            reverseWord += s.charAt(i);
        }

        return reverseWord;
    }
}
