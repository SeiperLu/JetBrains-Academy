package readability;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get(args[0]);
        String input = Files.readString(path);

        double charactersCount = 0.0;
        for (char c : input.toCharArray()) {
            if (!Character.isWhitespace(c))
                charactersCount++;
        }

        int sentencesCount = 0;
        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) == '!' || input.charAt(i) == '?' || input.charAt(i) == '.')
                sentencesCount++;
        }
        sentencesCount++;

        String[] words = input.split(" ");
        double wordsCount = words.length;


        System.out.println("Words: " + wordsCount);
        System.out.println("Sentences: " + sentencesCount);
        System.out.println("Characters: " + charactersCount);
        System.out.println("Syllables: " + syllablesNumber(input));
        System.out.println("Polysyllables: " + polysyllablesNumber(input));
        System.out.print("Enter the score you want to calculate (ARI, FK, SMOG, CL, all): ");
        Scanner scanner = new Scanner(System.in);
        String option = scanner.nextLine();
        System.out.println("\n");
        switch (option) {
            case "ARI":
                ARI(charactersCount,wordsCount,sentencesCount);
                break;
            case "FK":
                FK(wordsCount,syllablesNumber(input),sentencesCount);
                break;
            case "SMOG":
                SMOG(polysyllablesNumber(input),sentencesCount);
                break;
            case "CL":
                CL(charactersCount,wordsCount,sentencesCount);
                break;
            case "all":
                double  age = 0;
                age += ARI(charactersCount,wordsCount,sentencesCount);
                age += FK(wordsCount,syllablesNumber(input),sentencesCount);
                age += SMOG(polysyllablesNumber(input),sentencesCount);
                age += CL(charactersCount,wordsCount,sentencesCount);
                System.out.println("This text should be understood in average by " + age/4
                + "-year-olds.");
        }
    }

    public static int CL(double characters, double words, int sentences){
        double L = characters/words*100;
        double S = (double)sentences/words*100;
        double score = 0.0588 * L - 0.296 * S - 15.8;
        System.out.println("Coleman–Liau index: " + score + " (about " + ((int)score+6)
                + "-year-olds).");
        return (int)score+6;
    }

    public static int SMOG(int polysyllables, int sentences){
        double score = 1.043 * Math.sqrt(polysyllables * 30.0/sentences) + 3.1291;
        System.out.println("Simple Measure of Gobbledygook: " + score + " (about " + ((int)score+6)
                + "-year-olds).");
        return (int)score+6;
    }

    public static int FK(double words, int syllables, int sentences){
        double score = 0.39 * words/sentences + 11.8 * syllables/words -15.59;
        System.out.println("Flesch–Kincaid readability tests: " + score + " (about " + ((int)score+6)
                + "-year-olds).");
        return (int)score+6;
    }

    public static int ARI(double characters, double words, double sentences){
        double score = 4.71 * (characters /  words) + 0.5 * ( words/ sentences) - 21.43;
        System.out.printf("Automated Readability Index: %.2f (about %d-year-olds).\n",score,(int)score+6);
        return (int)score+6;
    }

    public static int syllablesNumber(String input){
        String[] words = input.split(" ");
        int syllablesCount = 0;
        for(String word : words){
            int vowels = vowelsNumber(word);
            if (vowels == 0)
                syllablesCount++;
            else if (vowels > 0)
                syllablesCount += vowels;
        }
        return syllablesCount;
    }

    public static int polysyllablesNumber(String input) {
        String[] words = input.split(" ");
        int polySyllablesCount = 0;
        for (String word : words) {
            int vowels = vowelsNumber(word);
            if (vowels > 2)
                polySyllablesCount++;
        }
        return polySyllablesCount;
    }

    public static int vowelsNumber(String word){
        int vowels = 0;
        if (word.chars().anyMatch(Character::isDigit))
            return -1;
        if (!Character.isAlphabetic(word.charAt(0))) {
            word  = word.substring(1);
        }
        if (!Character.isAlphabetic(word.charAt(word.length() - 1))) {
            word  = word.substring(0, word.length()-1);
        }
        for (int i = 0; i < word.length(); i++){
            if (i == word.length() - 1) {
                boolean isVowel = "aiouy".indexOf(Character.toLowerCase(word.charAt(i))) != -1;
                if (isVowel)
                    vowels++;
                break;
            }
            boolean isVowel = "aeiouy".indexOf(Character.toLowerCase(word.charAt(i))) != -1;
            if(i == 0 && isVowel)
            {
                vowels++;
                continue;
            }
            if(isVowel && "aeiouy".indexOf(Character.toLowerCase(word.charAt(i-1))) == -1)
                vowels++;
        }
        return vowels;
    }
}
