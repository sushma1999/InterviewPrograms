import java.util.Scanner;

public class ArmstrongNo {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int no = scan.nextInt();
        IsArmStrong(no);
    }

    public static void IsArmStrong(int no) {
        int givenNo = no;
        int remainder;
        int armstrong = 0;
        while (no != 0) {
            remainder = no % 10;
            no = no / 10;
            armstrong = armstrong + (remainder * remainder * remainder);
        }
        if (givenNo == armstrong) {
            System.out.println("Yes ,It is an ArmstrongNo");
        } else {
            System.out.println("No ,It is not an ArmstrongNo");

        }
    }


}
