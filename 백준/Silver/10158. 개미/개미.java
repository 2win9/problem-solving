import java.util.Scanner;

public class Main
{
//    public static int getGCD(int a, int b)
//    {
//        if(b>a)
//        {
//            int temp = a;
//            a = b;
//            b = temp;
//        }
//
//        if(a%b == 0)
//        {
//            return b;
//        }
//        return getGCD(b, a%b);
//    }
//
//    public static int getLCM(int a, int b)
//    {
//        int LCM = a*b / getGCD(a,b);
//        return LCM;
//    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int w  = sc.nextInt(); // size - x
        int h = sc.nextInt(); // size - y
        int p = sc.nextInt(); // start - x
        int q = sc.nextInt(); // start - y
        int t = sc.nextInt(); // time

        // t = t % getLCM(w,h); -> 시간초과

        // X,Y 좌표 나눠서 각각 계산
        int timeX = t % (2*w);
        int timeY = t % (2*h);
        int currentX = p;
        int currentY = q;
        int deltaX = 1;
        int deltaY = 1;

        while(timeX-- > 0)
        {
            if(currentX==w)
                deltaX = -1;
            else if(currentX==0)
                deltaX = 1;

            currentX += deltaX;
        }

        while(timeY-- > 0)
        {
            if(currentY==h)
                deltaY = -1;
            else if(currentY==0)
                deltaY = 1;

            currentY += deltaY;
        }

        System.out.println(currentX + " " + currentY);
    }
}
