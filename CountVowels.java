import java.util.Scanner;

public class CountVowels {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String input= scan.nextLine();

        System.out.println(CountNoOfVowels(input));
    }
    public static int CountNoOfVowels(String input)
    {
        if(input==null)
        {
            return 0;
        }
        var count=0;
           String vowels ="aeiou";
        for (var ch: input.toLowerCase().toCharArray()) {

            if(vowels.contains(Character.toString(ch)))
                    count++;

        }
        return count;
            }


}
