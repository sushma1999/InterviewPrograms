import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockAndValidString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int frequency = 0;
        int del = 0;

        for (int i = 0; i < input.length(); i++) {
            if (map.get(input.charAt(i)) == null) {
                map.put(input.charAt(i), 1);
            } else {
                map.put(input.charAt(i), map.get(input.charAt(i)) + 1);
            }
        }
        int total = 0;
        for (char c : map.keySet()) {

            total += map.get(c);
        }
        frequency =( total / map.keySet().size());

        for (char c : map.keySet()) {
            if (frequency != map.get(c)) {
                del++;
            }
        }
        if (del > 1) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }
}
