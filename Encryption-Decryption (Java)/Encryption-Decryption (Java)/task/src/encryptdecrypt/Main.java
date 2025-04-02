package encryptdecrypt;
import java.util.Scanner;
import java.io.File;
import java.io.PrintWriter;


public class Main {
    public static void main(String[] args) {
        String option = null;
        String messageToEncrypt = null;
        int encryptionKey = 0;
        String sourceFile = null;
        String destinationFile = null;
        String algorithm = null;
        for (int i = 0; i < args.length; i=i+2) {
            switch (args[i]){
                case "-mode":
                    option = args[i+1];
                    break;
                case "-key":
                    encryptionKey = Integer.parseInt(args[i+1]);
                    break;
                case "-data":
                    messageToEncrypt = args[i+1];
                    break;
                case "-in":
                    sourceFile = args[i+1];
                    break;
                case "-out":
                    destinationFile = args[i+1];
                    break;
                case "-alg":
                    algorithm = args[i+1];
                    break;
                    default:
                    continue;

            }
        }
        if (algorithm == null)
            algorithm = "shift";
        if (option == null)
            option = "enc";

        if (messageToEncrypt != null && sourceFile != null){
            if (option.equals("enc"))
                System.out.println(encrypt(messageToEncrypt,encryptionKey,algorithm));
            else if (option.equals("dec"))
                System.out.println(decrypt(messageToEncrypt,encryptionKey,algorithm));
            else
                System.out.println("Wrong option!");

        } else if (sourceFile != null) {
            File file = new File(sourceFile);
            try (Scanner scanner = new Scanner(file)){
                if (destinationFile != null){
                    File file1 = new File(destinationFile);
                    try(PrintWriter printWriter = new PrintWriter(file1)){
                        if (option.equals("enc"))
                            printWriter.println(encrypt(scanner.nextLine(),encryptionKey,algorithm));
                        else if (option.equals("dec"))
                            printWriter.println(decrypt(scanner.nextLine(), encryptionKey,algorithm));
                        else
                            System.out.println("Wrong option!");
                    } catch (Exception e) {
                        System.out.println("Error");
                        return;
                    }
                }else {
                    if (option.equals("enc"))
                        System.out.println(encrypt(scanner.nextLine(),encryptionKey,algorithm));
                    else if (option.equals("dec"))
                        System.out.println(decrypt(scanner.nextLine(), encryptionKey,algorithm));
                    else
                        System.out.println("Wrong option!");
                }
            } catch (Exception e) {
                System.out.println("Error");
                return;
            }

        }else {
            if (messageToEncrypt == null)
                messageToEncrypt = "";
            if (option.equals("enc"))
                System.out.println(encrypt(messageToEncrypt,encryptionKey,algorithm));
            else if (option.equals("dec"))
                System.out.println(decrypt(messageToEncrypt,encryptionKey,algorithm));
            else
                System.out.println("Wrong option!");
        }




    }

    static String encrypt(String message, int key, String algorithm){
        char[] encryptedMessage = new char[message.length()];
        int encryptedLetterIndex = 0;
        if (algorithm.equals("unicode")){
            for (int i = 0; i < message.length(); i++) {
                encryptedLetterIndex = ((int) message.charAt(i) - 32 + key) % 95;
                encryptedMessage[i] = (char) (encryptedLetterIndex + 32);
            }
            return String.valueOf(encryptedMessage);
        }else {
            for (int i = 0; i < message.length(); i++) {
                if (Character.isAlphabetic(message.charAt(i))){
                    if (Character.isUpperCase(message.charAt(i))){
                        encryptedLetterIndex = ((int) message.charAt(i) - 65 + key) % 26;
                        encryptedMessage[i] = (char) (encryptedLetterIndex + 65);
                    }else {
                        encryptedLetterIndex = ((int) message.charAt(i) - 97 + key) % 26;
                        encryptedMessage[i] = (char) (encryptedLetterIndex + 97);
                    }
                }else
                    encryptedMessage[i] = message.charAt(i);

            }
            return String.valueOf(encryptedMessage);
        }

    }

    static String decrypt(String message, int key, String algorithm){
        char[] encryptedMessage = new char[message.length()];
        int encryptedLetterIndex = 0;
        if (algorithm.equals("unicode")){
            for (int i = 0; i < message.length(); i++) {
                encryptedLetterIndex = (95 + (int) message.charAt(i) - 32 - key) % 95;
                encryptedMessage[i] = (char) (encryptedLetterIndex + 32);
            }
            return String.valueOf(encryptedMessage);
        }else {
            for (int i = 0; i < message.length(); i++) {
                if (Character.isAlphabetic(message.charAt(i))){
                    if (Character.isUpperCase(message.charAt(i))){
                        encryptedLetterIndex = (26 + (int) message.charAt(i) - 65 - key) % 26;
                        encryptedMessage[i] = (char) (encryptedLetterIndex + 65);
                    }else {
                        encryptedLetterIndex = (26 + (int) message.charAt(i) - 97 - key) % 26;
                        encryptedMessage[i] = (char) (encryptedLetterIndex + 97);
                    }
                }else
                    encryptedMessage[i] = message.charAt(i);

            }
            return String.valueOf(encryptedMessage);
        }

    }
}
