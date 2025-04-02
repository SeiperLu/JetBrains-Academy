import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        double start = scanner.nextDouble();
        double end = scanner.nextDouble();
        double sum = 0;
        int counter = 0;
        for (double i = start; i <= end ; i++) {
            if (i % 3 == 0) {
                sum += i;
                counter++;
            }
        }
        System.out.println(sum/counter);
    }
}