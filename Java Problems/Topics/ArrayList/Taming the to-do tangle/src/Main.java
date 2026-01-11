import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> taskList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String operation = scanner.nextLine();

            if (operation.equals("add")) {
                operation = scanner.nextLine();
                taskList.add(operation);
            } else if (operation.equals("remove")) {
                int index  = scanner.nextInt();
                taskList.remove(index);
            } else if (operation.equals("display")) {

            }

        }
        System.out.println(taskList);
        scanner.close();
    }
}