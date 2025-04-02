import java.util.*;

public class Main {

    // write a method here
    public static  int[] getFirstAndLast(int[] inArray){
        int[] outArray = new int[2];
        outArray[0] = inArray[0];
        outArray[1] = inArray[inArray.length - 1];
        return outArray;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = Arrays.stream(scanner.nextLine().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        int[] result = getFirstAndLast(array);
        Arrays.stream(result).forEach(e -> System.out.print(e + " "));
    }
}