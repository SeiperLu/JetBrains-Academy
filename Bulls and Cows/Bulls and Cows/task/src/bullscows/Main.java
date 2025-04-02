package bullscows;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the length of the secret code:");
        if (!scanner.hasNextInt())
        {
            String error = scanner.next();
            System.out.println("Error: \"" + error + "\" isn't a valid number.");
            return;
        }
        int lengthOfSecretCode = scanner.nextInt();
        if (lengthOfSecretCode <= 0){
            System.out.println("Error: length of secret code must be bigger that 0.");
            return;
        }

        System.out.println("Input the number of possible symbols in the code:");
        int numberOfPossibleSymbols = scanner.nextInt();
        if (lengthOfSecretCode > 36 || lengthOfSecretCode > numberOfPossibleSymbols || numberOfPossibleSymbols > 36){
            System.out.println("Error: can't generate a secret number with a length of " + lengthOfSecretCode + " because there aren't enough unique digits and characters.");
            return;
        }
        String secretCode = generateSecretCode(lengthOfSecretCode,numberOfPossibleSymbols);
        int numberOfBulls = 0;
        System.out.print("The secret is prepared: ");
        for (int i = 0; i < lengthOfSecretCode; i++) {
            System.out.print("*");
        }
        if (numberOfPossibleSymbols <=10){
            System.out.println(" (0-" + (-1+numberOfPossibleSymbols) + ").");
        }else {
            System.out.println(" (0-9), a-" + (char)((int)'a'+ numberOfPossibleSymbols-11) + ").");
        }
        System.out.println("Okay, let's start a game!");
        int attempt = 1;
        while (numberOfBulls != lengthOfSecretCode){
            System.out.println("Turn " + attempt + ":");
            String guessCode = scanner.next();
            numberOfBulls = check(secretCode,guessCode);
            attempt++;
        }
        System.out.println("Congratulations! You guessed the secret code.");
    }

    static int check(String secretCode, String guessCode){
        int numberOfCows = 0;
        int numberOfBulls = 0;
        StringBuilder inArray = new StringBuilder(secretCode.length());
        for (int i = 0; i < secretCode.length(); i++) {
            for (int j = 0; j < guessCode.length(); j++) {
                if (secretCode.charAt(i) == guessCode.charAt(j) && i == j){
                    if (contains(inArray.toString().toCharArray(),secretCode.charAt(i))){
                        numberOfBulls++;
                        numberOfCows--;
                        break;
                    }
                    numberOfBulls++;
                    break;
                }
                if (secretCode.charAt(i) == guessCode.charAt(j)){
                    if (!contains(inArray.toString().toCharArray(),secretCode.charAt(i))){
                        numberOfCows++;
                        inArray.append(guessCode.charAt(j));
                    }
                }
            }
        }
        if(numberOfBulls == 0 && numberOfCows == 0){
            System.out.println("Grade: None.");
            return numberOfBulls;
        }
        if (numberOfBulls > 0 && numberOfCows > 0){
            System.out.println("Grade: " + numberOfBulls + " bull(s) and " + numberOfCows + " cow(s).");
            return numberOfBulls;
        }
        if(numberOfBulls > 0 && numberOfCows == 0){
            System.out.println("Grade: " + numberOfBulls + " bull(s).");
            return numberOfBulls;
        }else {
            System.out.println("Grade: " + numberOfCows + " cow(s).");
            return numberOfBulls;
        }
    }

    static String generateSecretCode(int lengthOfSecretCode, int numberOfPossibleSymbols){

        int symbols =0;
        StringBuilder secretCode = new StringBuilder(lengthOfSecretCode);
        boolean inArray = false;
        int digit;
        int[] arrayOfDigits = new int[lengthOfSecretCode];
        char[] arrayOfSymbols = new char[lengthOfSecretCode];
        int  digitIndex = 0;
        int symbolsIndex = 0;
        int intervalLength = (122-(26-(numberOfPossibleSymbols-10))) - 97 + 1;
        Random random = new Random();
        while (symbols != lengthOfSecretCode){
            if (lengthOfSecretCode <= 10) {
                digit = random.nextInt(10);
                if (!contains(arrayOfDigits,digit)) {
                    arrayOfDigits[digitIndex] = digit;
                    digitIndex++;
                    symbols++;
                    secretCode.append(digit);
                }
            }else{
                if (random.nextInt(100) < 50){
                    digit = random.nextInt(10);
                    if (!contains(arrayOfDigits,digit)) {
                        arrayOfDigits[digitIndex] = digit;
                        digitIndex++;
                        symbols++;
                        secretCode.append(digit);
                    }
                }else{
                    digit = random.nextInt(intervalLength) + 97;
                    if(!contains(arrayOfSymbols,(char)digit)){
                        arrayOfSymbols[symbolsIndex] = (char)digit;
                        symbolsIndex++;
                        symbols++;
                        secretCode.append((char)digit);
                    }
                }

            }
        }
        return secretCode.toString();
    }

    static boolean contains(int[] array, int digit){
        for (int i : array){
            if (i == digit)
                return true;
        }
        return false;
    }

    static boolean contains(char[] array, char character){
        for (int i : array){
            if (i == character)
                return true;
        }
        return false;
    }



}
