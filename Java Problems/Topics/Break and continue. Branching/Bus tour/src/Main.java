import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int busHeight = scanner.nextInt();
        int bridgesNumber = scanner.nextInt();
        int bridgeHeight;
        boolean willCrash = false;
        for (int i = 0; i < bridgesNumber; i++) {
            bridgeHeight = scanner.nextInt();
            if (bridgeHeight > busHeight) {
                continue;
            } else {
                willCrash = true;
                System.out.println("Will crash on bridge " + ++i);
                break;
            }
        }
        if (!willCrash){
            System.out.println("Will not crash");
        }
        scanner.close();
    }
}