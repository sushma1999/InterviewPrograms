import java.util.Scanner;

public class FindSquareRoot {
    public static int SquareRoot(int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int i = 1;
        int result = 1;
        while (result <= n) {
            i++;
            result = i * i;
            if (result == n)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int no = scan.nextInt();
        if(SquareRoot(no)==-1)
        {
            System.out.println("Not a square Number");
        }
        else {
            System.out.print(SquareRoot(no));
        }
    }
}
