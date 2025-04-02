import java.util.Scanner; // 3.1 Import necessary library

public class Main { // 3.6 Always use 'Main' as class name

    // 3.0 No method main code here, user write their own

    public static void main(String[] args) {
        // 3.2 Create a Scanner object
        Scanner scanner = new Scanner(System.in);

        // TODO: 1. Ask user for an integer 'n' using scanner.nextInt()
        //System.out.println("Number to count factorial: ");
        // TODO: 2. Print the factorial of 'n'
        int number = scanner.nextInt();
        int result = 1;
        for (int i = 1; i <= number ; i++) {
            result *= i;
        }
        System.out.println(result);
        scanner.close(); // Always close the scanner when done
    }

}