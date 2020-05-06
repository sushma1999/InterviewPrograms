import java.util.Scanner;

public class NumberPattern {


    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int rows=scan.nextInt();
        int columns=scan.nextInt();

        for(int cr=rows;cr>0;cr--)
        {
            for(int cc=columns;cc>0;cc--)
            {
               if(cc>=cr)
               {
                   System.out.print(cc);
               }
               else
               {
                   System.out.print(cr);
               }
            }
            System.out.println();
        }
    }

}
