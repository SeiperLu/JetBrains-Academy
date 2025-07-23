import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        int hours = scanner.nextInt();
        int minutes = scanner.nextInt();
        LocalDateTime dateTime = LocalDateTime.parse(date);
        dateTime = dateTime.minusHours(hours);
        dateTime = dateTime.plusMinutes(minutes);
        System.out.println(dateTime);

    }
}