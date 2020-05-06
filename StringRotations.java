import java.util.Scanner;

public class StringRotations {
    public static boolean areRotations(String str1, String str2)
    {
        if (str1 == null || str2 == null)
            return false;

        return (str1.length() == str2.length() &&
                (str1 + str1).contains(str2));
    }
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        String s1=scan.nextLine();
        String s2=scan.nextLine();
        boolean result= areRotations(s1,s2);
        System.out.println(result);
    }

}
