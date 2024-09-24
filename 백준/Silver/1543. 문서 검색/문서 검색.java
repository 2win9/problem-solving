import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String document = sc.nextLine();
        String searchWord = sc.nextLine();

        int count = 0;

        for(int i=0; i<document.length(); i++)
        {
            boolean isMatch = true;

            for(int j=0; j<searchWord.length(); j++)
            {
                if((i+j) >= document.length() || document.charAt(i + j) != searchWord.charAt(j)) // 리스트 인덱스 범위 고려
                {
                    isMatch = false;
                    break;
                }
                else
                {
                    isMatch = true;
                }
            }

            if(isMatch)
            {
                count++;
                i = i + searchWord.length() - 1;
            }
        }

        System.out.print(count);
    }
}
