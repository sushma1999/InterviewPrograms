import java.util.Scanner;

public class HighestMark {

public static int FindHighestMark(int[] input){
    int max=0;
    for (var mark:input) {
        if(mark>max){
             max=mark;
        }

    }
    return max;
}



public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int[] marks=new int[a];
    for(int i=0;i<a;i++)
    {
         marks[i]=scan.nextInt();
    }
    System.out.println(FindHighestMark(marks));
}
}