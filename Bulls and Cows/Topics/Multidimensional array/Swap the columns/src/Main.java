import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner((System.in));
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] matrix = new int[rows][columns];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        int firstColumnToSwap = scanner.nextInt();
        int secondColumnToSwap = scanner.nextInt();
        int temporary;

        for (int i = 0; i < matrix.length; i++) {
            temporary = matrix[i][firstColumnToSwap];
            matrix[i][firstColumnToSwap] = matrix[i][secondColumnToSwap];
            matrix[i][secondColumnToSwap] = temporary;
        }

        for (int[] ints : matrix) {
            for (int anInt : ints) {
                System.out.print(anInt + " ");
            }
            System.out.println();
        }
    }
}