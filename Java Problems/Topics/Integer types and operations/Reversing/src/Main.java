import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int primeNumber = scanner.nextInt();
        int firstDigit = primeNumber / 100;
        int secondDigit = (primeNumber - firstDigit * 100) / 10;
        int thirdDigit = primeNumber % 10;
        int finalNumber = thirdDigit * 100 + secondDigit * 10 + firstDigit;
        System.out.println(finalNumber);
        scanner.close();
    }
}