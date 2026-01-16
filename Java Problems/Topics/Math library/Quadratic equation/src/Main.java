import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        double discriminant = Math.pow(b,2) - 4*a*c;
        double x1 = (-b -  Math.sqrt(discriminant))/(2*a);
        double x2 = (-b + Math.sqrt(discriminant))/(2*a);
        System.out.println(Math.min(x1,x2) + " " + Math.max(x1,x2));
    }
}