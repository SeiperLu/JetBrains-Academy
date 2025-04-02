import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        String string = scanner.nextLine();
        int startIndex = scanner.nextInt();
        int endIndex = scanner.nextInt();
        String subString = string.substring(startIndex,endIndex+1);
        System.out.println(subString);
        scanner.close();
    }
}