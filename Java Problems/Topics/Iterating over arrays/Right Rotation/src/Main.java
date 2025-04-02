import java.util.Scanner;
import java.util.Arrays;

class Main {
    // implement me
    private static void rotate(int[] arr, int steps) {
        int[] temArray = new int[arr.length];
        int realSteps = steps%arr.length;
        for (int i = 0; i < arr.length; i++) {
            if (i+1+realSteps <= arr.length) {
                temArray[i+realSteps] = arr[i];
            }else {
                temArray[i+realSteps-arr.length] = arr[i];
            }
        }
        System.arraycopy(temArray, 0, arr, 0, arr.length);

    }

    // do not change code below
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();

        int steps = Integer.parseInt(scanner.nextLine());

        rotate(arr, steps);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }
}