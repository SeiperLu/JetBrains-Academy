import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int numberCount = scanner.nextInt();
        int counter = 0;
        int number;
        int result = 0;
        while (counter < numberCount){
            number = scanner.nextInt();
            if((number % 4 == 0) && number > result)
            {
                result = number;
            }
            counter++;
        }
        System.out.println(result);
        scanner.close();
    }
}