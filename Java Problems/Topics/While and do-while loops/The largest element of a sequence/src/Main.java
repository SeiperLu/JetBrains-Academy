import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int number = 0;
        int result = 0;
        do {
            if (number > result){
                result = number;
            }
        } while ((number = scanner.nextInt()) != 0);
        System.out.println(result);
        scanner.close();
    }
}