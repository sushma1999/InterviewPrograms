import java.util.Scanner;

public class SentenceReverser {
    public static String SentenceReverse(String[] words) {
        StringBuilder myString = new StringBuilder();
        for (var i = words.length-1; i >= 0; i--) {
            myString.append(words[i]+" ");
        }
        return myString.toString();
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        String[] Eachword = input.split(" ");
        System.out.println(SentenceReverse(Eachword));

    }

}