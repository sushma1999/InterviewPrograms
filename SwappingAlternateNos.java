import java.util.Arrays;
import java.util.Scanner;

public class SwappingAlternateNos {

public static void main(String[] args)
{
    Scanner scan = new Scanner(System.in);
    String no=scan.nextLine();
    char[] CArray=no.toCharArray();
    int length = CArray.length%2==0?CArray.length:CArray.length-1;
    for(int i=0;i<length;i=i+2)
    {

        var temp=CArray[i];
        CArray[i]=CArray[i+1];
        CArray[i+1]=temp;

    }
    String result= new String(CArray);
    System.out.println(result);


}
}
