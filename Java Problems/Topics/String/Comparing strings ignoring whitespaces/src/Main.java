import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String firstString = scanner.nextLine();
        String secondString = scanner.nextLine();
        String firstStringTrim = firstString.replace(" ", "");
        String secondStringTrim = secondString.replace(" ", "");
        System.out.println(firstStringTrim.equals(secondStringTrim));
        scanner.close();
    }
}