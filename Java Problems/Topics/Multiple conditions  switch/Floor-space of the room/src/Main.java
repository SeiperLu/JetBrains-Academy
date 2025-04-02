import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        double area;
        String roomType = scanner.nextLine();
        switch (roomType){
            case "triangle":
                double a = scanner.nextDouble();
                double b = scanner.nextDouble();
                double c = scanner.nextDouble();
                double halfOfCircuit = (a+b+c)/2;
                area = Math.sqrt(halfOfCircuit*(halfOfCircuit-a)*(halfOfCircuit-b)*(halfOfCircuit-c));
                System.out.println(area);
                break;
            case "rectangle":
                double d = scanner.nextDouble();
                double e = scanner.nextDouble();
                area = d * e;
                System.out.println(area);
                break;
            case "circle":
                double r = scanner.nextDouble();
                area = 3.14 * r *r;
                System.out.println(area);
                break;
        }
        scanner.close();
    }
}