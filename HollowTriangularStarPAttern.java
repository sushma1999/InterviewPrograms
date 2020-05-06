import java.util.Scanner;

public class HollowTriangularStarPAttern {

    public static void StarPattern(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                    System.out.print(" ");
                }


            for (int k = 0; k <= i; k++) {
                if((k==0||k==i)&&(i!=n)) {
                    System.out.print("* ");
                }
                else if(i!=n)
                {
                    System.out.print("  ");
                }
                else
                {
                    System.out.print("* ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        StarPattern(n);
    }
}
