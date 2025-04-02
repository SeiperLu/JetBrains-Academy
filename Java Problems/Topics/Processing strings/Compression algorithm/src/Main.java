import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String output = "";
        char currentChar = input.charAt(0);
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (currentChar == input.charAt(i)) {
                count++;
            } else {
                output = output.concat(String.valueOf(currentChar));
                output = output.concat(String.valueOf(count));
                currentChar = input.charAt(i);
                count = 1;
            }
            if (i == input.length() - 1) {
                output = output.concat(String.valueOf(currentChar));
                output = output.concat(String.valueOf(count));
            }
        }
        System.out.println(output);
        scanner.close();
    }
}