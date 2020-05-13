public class FindMissingNoFrom1to100 {

    public static void main(String[] args)
    {
        int Expectedsum=0;
        int Actualsum=0;
        int[] Givenarray= {1,2,3,4,6,7,8,9,10};

        for(int i=1;i<=10;i++)
        {
            Expectedsum=Expectedsum+i;
        }
        for(int j=0;j<=Givenarray.length-1;j++)
        {
            Actualsum=Actualsum + Givenarray[j];
        }
        System.out.println("The missing no is: "+(Expectedsum-Actualsum));

    }
}
