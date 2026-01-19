import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the string input from the user
        String input = scanner.nextLine();

        // Split the string by commas into an array of names
        String[] names = input.split(",");

        // TODO: Implement a Set to keep track of unique names
        // The Set interface is part of Java's collections framework and is used
        // to store unique elements - duplicates are automatically disregarded
        Set<String> set = new LinkedHashSet<>(Arrays.asList(names));
        List<String> list = new ArrayList<>(set);
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            }else  {
                System.out.print(list.get(i) + ",");
            }
        }

    }
}