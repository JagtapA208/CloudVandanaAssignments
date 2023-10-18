import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class RomanToInt {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter Roman number : ");
        String romanNumber = br.readLine();

        int integerNumber = romanToInt(romanNumber);
        System.out.println("Integer Number : " + integerNumber);
    }

    public static int romanToInt(String s) {

        int intNumber = 0;
        int previousValue = 0;

        HashMap<Character, Integer> romanToIntMap = new HashMap<>();
        romanToIntMap.put('I', 1);
        romanToIntMap.put('V', 5);
        romanToIntMap.put('X', 10);
        romanToIntMap.put('L', 50);
        romanToIntMap.put('C', 100);
        romanToIntMap.put('D', 500);
        romanToIntMap.put('M', 1000);

        for (int i = s.length() - 1; i >= 0; i--) {
            int currentValue = romanToIntMap.get(s.charAt(i));

            if (currentValue >= previousValue) {
                intNumber += currentValue;
            } else {
                intNumber -= currentValue;
            }

            previousValue = currentValue;
        }
        return intNumber;
    }
}
