import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for(int i=0; i<N; i++)
        {
            for(int j=0; j<N-i-1; j++)
            {
                System.out.print(" ");
            }
            for(int j=0; j<2*i+1; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=0; i<N-1; i++) // 0 1 2 3 4
        {
            for(int j=0; j<i+1; j++)
            {
                System.out.print(" ");
            }
            for(int j=0; j<2*N-1 -2*(i+1); j++) // 7 5 3 1 - 2 4 6 8
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}