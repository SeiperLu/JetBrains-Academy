import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        String pointOfTime = scanner.nextLine();
        String pointOfTime2 = scanner.nextLine();
        LocalTime localTime = LocalTime.parse(pointOfTime);
        LocalTime localTime2 = LocalTime.parse(pointOfTime2);
        int secondsLocalTime = localTime.toSecondOfDay();
        int secondsLocalTime2 = localTime2.toSecondOfDay();
        if (secondsLocalTime > secondsLocalTime2)
            System.out.println(secondsLocalTime -  secondsLocalTime2);
        else
            System.out.println(secondsLocalTime2 - secondsLocalTime);
    }
}