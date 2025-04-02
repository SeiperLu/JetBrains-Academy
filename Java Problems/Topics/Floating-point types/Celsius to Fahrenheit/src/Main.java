import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double celsiusTemperature = scanner.nextDouble();
        System.out.println(celsiusTemperature * 1.8 +32);
    }
}