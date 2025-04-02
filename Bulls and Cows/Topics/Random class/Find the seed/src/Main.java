import java.util.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // write your code here
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int index = 0;
        int minimumIndex = 0;
        int minimum = k+1;
        int[] maximums = new int[b-a+1];
        for (int i = a; i <= b ; i++) {
            int[] numbers = new int[n];
            Random random = new Random(i);
            for (int j = 0; j < n; j++) {
                numbers[j] = random.nextInt(k);
            }
            maximums[index] = Arrays.stream(numbers).max().getAsInt();
            if (maximums[index] < minimum) {
                minimum = maximums[index];
                minimumIndex = index;
            }
            index++;
        }
        System.out.println(a+minimumIndex);
        System.out.println(minimum);
        scanner.close();
    }
}