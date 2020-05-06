import java.util.Scanner;

public class NoOfVowelsInString {
    public static int CountVowels(String a){
       if(a==null){
           return 0;
       }
        int count=0;
        String vowels = "aeiou";
        for(var ch:a.toLowerCase().toCharArray())
           if (vowels.contains(Character.toString(ch)))
               count++;

           return count;
        }

 public static void main(String[] args)
 {
     Scanner scan=new Scanner(System.in);
     String input=scan.nextLine();
     int result=CountVowels(input);

     System.out.println(result);
 }












}
