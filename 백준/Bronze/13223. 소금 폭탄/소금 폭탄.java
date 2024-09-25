import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String[] currentTimes = sc.next().split(":");
        String[] dropTimes = sc.next().split(":");

        int currentHour = Integer.parseInt(currentTimes[0]);
        int currentMinute = Integer.parseInt(currentTimes[1]);
        int currentSecond = Integer.parseInt(currentTimes[2]);

        int dropHour = Integer.parseInt(dropTimes[0]);
        int dropMinute = Integer.parseInt(dropTimes[1]);
        int dropSecond = Integer.parseInt(dropTimes[2]);

        int currentSecondAmount = currentHour*3600 + currentMinute*60 + currentSecond;
        int dropSecondAmount = dropHour*3600 + dropMinute*60 + dropSecond;

        int requiredSecondAmount = dropSecondAmount - currentSecondAmount;

        if(requiredSecondAmount <= 0)
        {
            requiredSecondAmount += 24*60*60;
        }

        int requiredHour = requiredSecondAmount / 3600;
        int requiredMinute = (requiredSecondAmount % 3600) / 60;
        int requiredSecond = requiredSecondAmount % 60;

        System.out.print(String.format("%02d:%02d:%02d", requiredHour, requiredMinute, requiredSecond));
    }
}
