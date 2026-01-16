import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        double[] firstVector =  new double[2];
        double[] secondVector = new double[2];
        firstVector[0] = scanner.nextDouble();
        firstVector[1] = scanner.nextDouble();
        secondVector[0] = scanner.nextDouble();
        secondVector[1] = scanner.nextDouble();

        double dotProduct = firstVector[0] * secondVector[0] + firstVector[1] * secondVector[1];
        double firstVectorLength = Math.sqrt(firstVector[0] * firstVector[0] + firstVector[1] * firstVector[1]);
        double secondVectorLength = Math.sqrt(secondVector[0] * secondVector[0] + secondVector[1] * secondVector[1]);
        double angel = Math.acos(dotProduct/(firstVectorLength*secondVectorLength));
        System.out.println(Math.toDegrees(angel));
    }
}