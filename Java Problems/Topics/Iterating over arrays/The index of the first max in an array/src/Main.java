import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int arrayElements = scanner.nextInt();
        int[] array = new int[arrayElements];
        int maximumIndex = 0;
        for (int i = 0; i < arrayElements; i++) {
            array[i] = scanner.nextInt();
            if(array[i] > array[maximumIndex]){
                maximumIndex = i;
            }
        }
        System.out.println(maximumIndex);
    }
}