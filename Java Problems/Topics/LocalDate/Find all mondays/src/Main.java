import java.time.LocalDate;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int numberOfDays = 0;
        if(year == 2025){
            for (int i = month; i < 6; i++) {
                numberOfDays = LocalDate.of(2025,i,1).lengthOfMonth();
            }
        }else {
            for (int i = year; i <= 2025; i++) {
                if (i == year)
                    for (int j = month; j <= 12; j++) {
                        numberOfDays += LocalDate.of(i,j,1).lengthOfMonth();
                    }
                else if (i == 2025) {
                    for (int j =1; j<6; j++){
                        numberOfDays += LocalDate.of(i,j,1).lengthOfMonth();
                    }
                } else {
                    for (int j = 1; j <= 12; j++) {
                        numberOfDays += LocalDate.of(i,j,1).lengthOfMonth();
                    }
                }
            }
        }

        numberOfDays += 30;
        int daysShift = numberOfDays % 7;
        LocalDate dateOfFirstMonday = LocalDate.of(year,month,daysShift);
        for (int i = daysShift; i <= dateOfFirstMonday.lengthOfMonth(); i = i+7) {
            System.out.println(LocalDate.of(year,month,i));
        }
    }
}