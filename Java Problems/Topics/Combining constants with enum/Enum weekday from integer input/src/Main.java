import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int dayNumber = scanner.nextInt();

        Weekday day = Weekday.values()[dayNumber - 1];
        System.out.println(day);
    }
}

enum Weekday {
    // Define the enum constants here
    MONDAY(1), TUESDAY(2), WEDNESDAY(3), THURSDAY(4), FRIDAY(5), SATURDAY(6),SUNDAY(7);

    private final int value;

    Weekday(final int newValue){
        this.value = newValue;
    }

    public int getValue(){
        return this.value;
    }

}