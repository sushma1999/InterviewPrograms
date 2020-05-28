import java.util.Scanner;

public class PrimeOrNot {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int no = scan.nextInt();
        boolean prime = true;
        int i = 2;
        if (no == 1) {
            System.out.print("Not Prime");
        }
        while (i < no / 2) {
            if (no % i == 0) {
                prime = false;
                break;
            } else {

                i++;

            }
        }
        if (prime)
            System.out.print("Prime");
        else
            System.out.print("Not Prime");
    }
}
