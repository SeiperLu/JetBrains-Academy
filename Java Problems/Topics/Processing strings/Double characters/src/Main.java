import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        String originalWord = scanner.nextLine();
        String newWord = "";
        for (int i = 0; i < originalWord.length(); i++) {
            newWord = newWord.concat(originalWord.substring(i,i+1));
            newWord = newWord.concat(originalWord.substring(i,i+1));
        }
        System.out.println(newWord);
    }
}