import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Use a Scanner to read user input
        Scanner sc = new Scanner(System.in);

        // Read the number of apples from the user
        int apples = sc.nextInt();

        // Read the number of oranges from the user
        int oranges = sc.nextInt();

        // Calculate the total number of fruits and print the result
        int  sum = apples + oranges;
        System.out.println(sum);
        sc.close();
    }
}