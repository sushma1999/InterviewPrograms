import java.util.Scanner;

public class BoxPatternInside {

    public static void Pattern(int rows, int cols) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= cols; j++) {
                if (i == 1 || i == rows || j == 1 || j == cols) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }

System.out.println();        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int rows = scan.nextInt();
        int cols = scan.nextInt();
        Pattern(rows, cols);
    }
}
