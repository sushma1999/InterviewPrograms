
import java.util.*;
public class MakingAnagrams {
    public static int numberNeeded(String first, String second) {
        int lettercount[] = new int[26];
        for(char ch : first.toCharArray())
        {
            lettercount[ch-97]++;
        }
        for(char ch : second.toCharArray())
        {
            lettercount[ch-97]--;
        }
        int result =0;
        for(int i : lettercount)
        {
            result =result+Math.abs(i);

        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
