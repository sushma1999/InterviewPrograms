import java.util.Scanner;

public class FrequencyOfDigits {
    public static void FindFrequency(int no){
        String inputString=Integer.toString(no);
   char[] CArray=inputString.toCharArray();
   int[] IArray =new int[CArray.length];
   for(int i=0;i<CArray.length;i++)
   {
       IArray[i]= Character.getNumericValue(CArray[i]);
   }
   int[] frequency=new int[10];
   for(int i=0;i<IArray.length;i++)
   {
       int value=IArray[i];
       frequency[value]++;
   }
   for(int i=0;i<10;i++)
   {
       if(frequency[i]>0)
       System.out.println(i+": "+frequency[i]);
   }
    }
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int no= scan.nextInt();
        FindFrequency(no);
    }
}
