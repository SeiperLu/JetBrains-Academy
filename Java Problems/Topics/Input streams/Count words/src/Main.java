import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // start coding here
        String input = reader.readLine();
        input = input.trim();
        if (input.isEmpty()) {
            System.out.println("0");
            return;
        }
        input = input.replaceAll("\\s{2,}", " ");
        String[] words = input.split(" ");
        System.out.println(words.length);
        reader.close();
    }
}