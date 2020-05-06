import java.util.Scanner;

public class ReversingASentence {
    public static String SentenceReverser(String[] words)
    {
        StringBuilder reversed = new StringBuilder();
        for (var i = words.length- 1; i >= 0; i--) {
            reversed.append(words[i]);
            reversed.append(" ");
        }

        return reversed.toString();
        }




    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String input=scan.nextLine();
        String[] words=input.split(" ");
        System.out.println(SentenceReverser(words));
    }

}
