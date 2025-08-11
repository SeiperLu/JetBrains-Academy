import java.util.*;
import java.util.function.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean isAscending = "ascending".equals(scanner.nextLine());
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();


        // write your code here
        class compareInts {
            public int compare(int a, int b) {
                if (a == b)
                    return a;
                int bigger = a < b ? b : a;
                int lower = a < b ? a : b;
                if (isAscending)
                    return lower;
                else
                    return bigger;
            }
        }
        compareInts comparatorInts = new compareInts();
        BiFunction<Integer, Integer, Integer> comparator = comparatorInts::compare;


        sort(array, comparator);
        Arrays.stream(array).forEach(e -> System.out.print(e + " "));
    }


    public static void sort(int[] array, BiFunction<Integer, Integer, Integer> comparator) {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (comparator.apply(array[j], array[j + 1]) == array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}