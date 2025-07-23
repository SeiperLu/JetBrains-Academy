import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String date = scanner.nextLine();
        LocalDateTime dateTime = LocalDateTime.parse(date);
        dateTime = dateTime.plusHours(11);
        LocalDate dateFinal = dateTime.toLocalDate();
        System.out.println(dateFinal);

    }
}