import java.util.Scanner;

public class SqaureRoot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int no = scanner.nextInt();

        if (FindSquareRoot(no) == -1) {
            System.out.print(" Not a square root ");
        } else {
            System.out.println(FindSquareRoot(no));
        }
    }

    public static int FindSquareRoot(int no) {
        if (no == 0 || no == 1) {
            return no;
        }
        int i = 1;
        int result = 1;

        while (result <= no) {
            i++;
            result = i * i;
            if (result == no) {
                return i;
            }
        }
        return -1;

    }
}
