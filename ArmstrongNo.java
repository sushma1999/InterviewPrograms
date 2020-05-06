import java.util.Scanner;

public class ArmstrongNo {
    public static boolean IsArmstrongno(int n) {
        int remainder = 0, Armstrong = 0;
        int Truevalue = n;
        while (n != 0) {
            remainder = n % 10;
            n = n / 10;
            Armstrong = Armstrong + (remainder * remainder * remainder);
        }
        return (Truevalue == Armstrong);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int no = scan.nextInt();
        System.out.print(IsArmstrongno(no));
    }
}
