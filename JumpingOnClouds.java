import java.util.Scanner;

public class JumpingOnClouds {


    static int jumpingOnClouds(int[] c) {
        int len = c.length;
        int Jumpcount = -1;

        for (int i = 0; i < len; i++, Jumpcount++) {
            if (i + 2 < len && c[i + 2] == 0) {
                i++;
            }
        }
        return Jumpcount;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int c[] = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        int ans = jumpingOnClouds(c);
        System.out.println(ans);
        sc.close();
    }
}