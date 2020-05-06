import java.util.Scanner;

public class HalfPyramid {

    public static void MyPattern(int n)
    {
        int j, i;
        for (i = 0; i < n; i++) {
            for (j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
MyPattern(n);

    }
}