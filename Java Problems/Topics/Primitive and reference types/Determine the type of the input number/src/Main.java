import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()){
            int number = sc.nextInt();
            if (number == 0) {
                System.out.println("zero");
            } else if (number < 0) {
                System.out.println("negative");
            } else {
                System.out.println("positive");
            }
        } else {
            System.out.println("non-integer");
        }

        // Place your code here


        sc.close();
    }
}