import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class RansomNote {

    public static boolean isMessageReplicable(String[] magazine, String[] ransom) {
        Map<String, Integer> magazineWords = new HashMap<String, Integer>();

        for (int i = 0; i < magazine.length; i++) {
            Integer wordCount = magazineWords.get(magazine[i]);
            if (wordCount == null) {
                magazineWords.put(magazine[i], 1);
            } else {
                magazineWords.put(magazine[i], wordCount + 1);
            }
        }

        for (int i = 0; i < ransom.length; i++) {
            Integer wordCount = magazineWords.get(ransom[i]);
            if (wordCount == null || wordCount == 0) {
                return false;
            } else {
                magazineWords.put(ransom[i], wordCount - 1);
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        String magazine[] = new String[m];
        for (int i = 0; i < m; i++) {
            magazine[i] = scan.next();
        }
        String ransom[] = new String[n];
        for (int j = 0; j < n; j++) {
            ransom[j] = scan.next();
        }
        String result = isMessageReplicable(magazine, ransom) ? "Yes" : "No";
        System.out.println(result);
    }
}

