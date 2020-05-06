public class CheckPermutation {
    public static String sort(String s) {
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    public static boolean permutation(String s, String t) {
        return sort(s).equals(sort(t));
    }

    public static void main(String[] args) {
        String[][] pairs = {{"apple", "papele"}, {"carrot", "tarroc"}, {"hello", "llloh"}};
        for (String[] pair : pairs) {
            String word1 = pair[0];
            String word2 = pair[1];
            boolean anagram;
            if (word1.length() == word2.length())
                anagram = permutation(word1, word2);
            else
                anagram = false;
            System.out.println(word1 + ", " + word2 + ": " + anagram);
        }
    }
}
