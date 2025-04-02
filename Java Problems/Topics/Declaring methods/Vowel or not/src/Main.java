import java.util.Scanner;

public class Main {

    public static boolean isVowel(char ch) {
        // write your code here
        if (ch == 'A'){
            return true;
        }
        if (ch == 'a'){
            return true;
        }
        if (ch == 'E'){
            return true;
        }
        if (ch == 'e'){
            return true;
        }
        if (ch == 'I'){
            return true;
        }
        if (ch == 'i'){
            return true;
        }
        if (ch == 'O'){
            return true;
        }
        if (ch == 'o'){
            return true;
        }
        if (ch == 'U'){
            return true;
        }
        return ch == 'u';
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.nextLine().charAt(0);
        System.out.println(isVowel(letter) ? "YES" : "NO");
    }
}