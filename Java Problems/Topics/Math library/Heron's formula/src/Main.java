import java.util.Scanner;class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        double p = (double)(a+b+c)/2;
        double S = Math.sqrt(p*(p-a)*(p-b)*(p-c));
        System.out.println(S);
    }
}