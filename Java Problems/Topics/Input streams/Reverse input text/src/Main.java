import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        // start coding here
        ArrayList<Character> text = new ArrayList<>();
        int buffer = reader.read();
        while (buffer != -1) {
            text.add((char) buffer);
            buffer = reader.read();
        }
        for (int i = text.size()-1; i >= 0; i--) {
            System.out.print(text.get(i));
        }
        reader.close();
    }
}