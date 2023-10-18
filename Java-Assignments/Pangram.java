import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Pangram {
    public static void main(String[] args) throws IOException {

         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Sentence to check Pangram or not : ");
        String sentence = br.readLine();

        if (isPangram(sentence)) {
            System.out.println("The sentence is a pangram.");
        } else {
            System.out.println("The sentence is not a pangram.");
        }
    }

    public static boolean isPangram(String sentence) {

        sentence = sentence.toLowerCase();

        boolean[] alphabets = new boolean[26];

        for (int i = 0; i < sentence.length(); i++) {

            char ch = sentence.charAt(i);
            
            if (Character.isLetter(ch)) {
                int index = ch - 97;
                alphabets[index] = true;
            }
        }

        for (boolean alphabetPresent : alphabets) {
            if (!alphabetPresent) {
                return false;
            }
        }
        
        return true;
    }
}
