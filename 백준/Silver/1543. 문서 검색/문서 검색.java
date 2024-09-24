import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String document = sc.nextLine();
        String searchWord = sc.nextLine();

        int startIndex = 0;
        int count = 0;

        while(true)
        {
            startIndex = document.indexOf(searchWord, startIndex);

            if(startIndex >= 0)
            {
                count++;
                startIndex += searchWord.length();
            }
            else
            {
                break;
            }
        }
        System.out.print(count);
    }
}
