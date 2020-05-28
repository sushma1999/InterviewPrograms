import java.util.Scanner;

public class CountNoOfDigits {

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int no= scan.nextInt();

        Counting(no);
    }
 public static void Counting(int number){
   int count =0;

   if(number!=0)
   {
       do{
           number=number/10;
           count ++;
       } while(number!=0);

   }
System.out.println(count);
    }

}
