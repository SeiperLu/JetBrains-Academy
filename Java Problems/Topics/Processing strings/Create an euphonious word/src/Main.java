import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner scanner = new Scanner(System.in);
        String originalWord = scanner.nextLine();
        char[] vowels = {'a','e','i','o','u','y'};
        int numberOfVowels = 0;
        int numberOfConsonants = 0;
        int numberOfLettersToInsert = 0;
        for (int i = 0; i < originalWord.length(); i++) {
            for (int j = 0; j < vowels.length; j++) {
                if (originalWord.charAt(i) == vowels[j]) {
                    numberOfConsonants = 0;
                    numberOfVowels++;
                    break;
                }
                if (j == vowels.length-1){
                    numberOfVowels = 0;
                    numberOfConsonants++;
                }
            }
            if (numberOfVowels >= 3){
                numberOfLettersToInsert++;
                numberOfVowels = 1;
                numberOfConsonants = 0;
            }
            if (numberOfConsonants >= 3){
                numberOfLettersToInsert++;
                numberOfConsonants = 1;
                numberOfVowels = 0;
            }

        }
        System.out.println(numberOfLettersToInsert);

    }
}