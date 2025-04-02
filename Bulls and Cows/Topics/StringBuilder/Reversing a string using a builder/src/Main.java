import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the input string
        String inputString = scanner.nextLine();

        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder(inputString);

        // Reverse the string using StringBuilder
        sb.reverse();
        // Print the reversed string
        System.out.println(sb.toString());
    }
}