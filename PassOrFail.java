import java.util.Scanner;
public class PassOrFail {
public static String IsShePassOrFail(int no,int[] list) {
    for (int i=0;i<list.length;i++ )
    {
        if(list[i]==no)
        {
            return "She Passed her exam";
        }
    }
    return "She Failed";
}

public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int[] regno=new int[a];
        scan.nextLine();
        String[] passedRegNo = scan.nextLine().split(" ");

         for(int i=0;i<passedRegNo.length;i++)
             regno[i]=Integer.parseInt(passedRegNo[i]);

        int herReg=scan.nextInt();
       String resut= IsShePassOrFail(herReg,regno);
       System.out.println(resut);
        }
        }
