import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
public class RemoveDuplicates {

    public static String removeDuplicates(String str) {
        if (str == null)
            return "";

        StringBuilder output = new StringBuilder();
        Set<Character> seen = new HashSet<>();

        for (var ch : str.toCharArray()) {
            if (!seen.contains(ch)) {
                seen.add(ch);
                output.append(ch);
            }
        }
        return output.toString();
    }

        public static void main (String[]args){
            Scanner scan = new Scanner(System.in);
            String s1 = scan.nextLine();
            System.out.println(removeDuplicates(s1));
        }
    }
