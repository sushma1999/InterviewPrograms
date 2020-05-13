import java.util.Scanner;

public class NumberDiamond {
    public static void NumberDiamondPattern(int n) {

        for(int i=1;i<=n;i++) {

            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++) {
                System.out.print(i+" ");

            }
           System.out.println();
        }
        for(int i=n-1;i>=0;i--) {

            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(int k=0;k<i;k++) {
                System.out.print(i+" ");

            }
            System.out.println();
        }

    }

        public static void main(String[] args)
        {
            Scanner scanner= new Scanner(System.in);
            int n=scanner.nextInt();

            NumberDiamondPattern(n);
        }
    }


