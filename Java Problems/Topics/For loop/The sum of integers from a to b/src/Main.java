import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int sum = 0;
        for (; start <= end ; start++) {
            sum += start;
        }
        System.out.println(sum);
        scanner.close();
    }
}