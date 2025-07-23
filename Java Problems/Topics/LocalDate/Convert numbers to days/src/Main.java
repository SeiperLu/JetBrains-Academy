import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        int year;
        int firstDate;
        int secondDate;
        int thirdDate;
        Scanner scanner = new Scanner(System.in);
        year = scanner.nextInt();
        firstDate = scanner.nextInt();
        secondDate = scanner.nextInt();
        thirdDate = scanner.nextInt();
        System.out.println(LocalDate.ofYearDay(year, firstDate));
        System.out.println(LocalDate.ofYearDay(year, secondDate));
        System.out.println(LocalDate.ofYearDay(year, thirdDate));
    }
}