import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class PrintRepeatedCharacterOfAString {

    public static void FindRepeatedCharacters(String input) {//programming
        HashMap<Character, Integer> RepeatedChar = new HashMap<>();
        char[] CArray = new char[input.length()];
        CArray = input.toCharArray();

        for (int i = 0; i < input.length(); i++) {
            if (RepeatedChar.containsKey(CArray[i])) {

                RepeatedChar.replace(CArray[i], RepeatedChar.get(CArray[i]) + 1);
            } else {
                RepeatedChar.put(CArray[i], 1);
            }
        }

        String result = Arrays.toString(RepeatedChar.entrySet().toArray());

        System.out.println(result);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();

        FindRepeatedCharacters(input);
    }
}
