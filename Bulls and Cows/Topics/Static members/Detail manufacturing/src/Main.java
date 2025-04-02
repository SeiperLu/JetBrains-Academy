import java.util.Scanner;

class ManufacturingController {
    // here you may declare a field
    static private int requestCount = 0;

    public static String requestProduct(String product) {
        // write your code here
        requestCount++;
        return requestCount + "." + " Requested " + product;
    }

    public static int getNumberOfProducts() {
        // write your code here
        return requestCount;
    }
}

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String product = scanner.nextLine();
            System.out.println(ManufacturingController.requestProduct(product));
            System.out.println(ManufacturingController.getNumberOfProducts());
        }
    }
}