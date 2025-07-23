import java.time.LocalTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String pointOfTime = scanner.nextLine();
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        LocalTime localTime = LocalTime.parse(pointOfTime);
        System.out.println(localTime.minusHours(hours).minusMinutes(minutes));

    }
}