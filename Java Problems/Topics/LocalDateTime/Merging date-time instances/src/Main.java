import java.time.LocalDateTime;
import java.util.Scanner;

public class Main {

    public static LocalDateTime merge(LocalDateTime dateTime1, LocalDateTime dateTime2) {
        // write your code here
        LocalDateTime finalDateTime = LocalDateTime.of(2025,1,1,1,1,1);
        if (dateTime1.getYear() > dateTime2.getYear())
            finalDateTime = finalDateTime.withYear(dateTime1.getYear());
        else
            finalDateTime = finalDateTime.withYear(dateTime2.getYear());

        if (dateTime1.getMonthValue() > dateTime2.getMonthValue())
            finalDateTime = finalDateTime.withMonth(dateTime1.getMonthValue());
        else
            finalDateTime = finalDateTime.withMonth(dateTime2.getMonthValue());

        if (dateTime1.getDayOfMonth() > dateTime2.getDayOfMonth())
            finalDateTime = finalDateTime.withDayOfMonth(dateTime1.getDayOfMonth());
        else
            finalDateTime = finalDateTime.withDayOfMonth(dateTime2.getDayOfMonth());

        if (dateTime1.getHour() > dateTime2.getHour())
            finalDateTime = finalDateTime.withHour(dateTime1.getHour());
        else
            finalDateTime = finalDateTime.withHour(dateTime2.getHour());

        if (dateTime1.getMinute() > dateTime2.getMinute())
            finalDateTime = finalDateTime.withMinute(dateTime1.getMinute());
        else
            finalDateTime = finalDateTime.withMinute(dateTime2.getMinute());

        if (dateTime1.getSecond() > dateTime2.getSecond())
            finalDateTime = finalDateTime.withSecond(dateTime1.getSecond());
        else
            finalDateTime = finalDateTime.withSecond(dateTime2.getSecond());
        return finalDateTime;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final LocalDateTime firstDateTime = LocalDateTime.parse(scanner.nextLine());
        final LocalDateTime secondDateTime = LocalDateTime.parse(scanner.nextLine());
        System.out.println(merge(firstDateTime, secondDateTime));
    }
}