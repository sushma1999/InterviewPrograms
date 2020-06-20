import java.util.Scanner;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class RepeatedString {

    // Complete the repeatedString function below.
    public static long repeatedString(String s, long n) {
        final long quotient = n / s.length();
        final long remainder = n % s.length();
        long aCount = 0;

        if ((s.length() == 1) && (s.charAt(0) == 'a')) {
            return n;
        }
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                aCount++;
            }
        }
        aCount = aCount * quotient;
        for (int i = 0; i < remainder; i++) {
            if (s.charAt(i) == 'a') {
                aCount++;
            }
        }
        return aCount;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();

        long n = scanner.nextLong();

        long result = repeatedString(s, n);
System.out.println(result);

    }
}
