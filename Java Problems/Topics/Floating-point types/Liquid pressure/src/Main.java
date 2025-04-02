import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        double liquidDensity = scanner.nextDouble();
        double columnHeight = scanner.nextDouble();
        double gravitationalAcceleration = 9.8;
        System.out.println(liquidDensity*columnHeight*gravitationalAcceleration);
    }
}