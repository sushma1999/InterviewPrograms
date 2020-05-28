import java.util.Scanner;
import java.util.Stack;

public class SplitNoIntoDigits {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int number= scan.nextInt();
        int remainder;
        Stack<Integer> myStack =  new Stack<>();

        while(number>0)
        {

myStack.push(number%10);
            number=number/10;
        }
        while (!myStack.isEmpty())
        {
            System.out.println(myStack.pop());
        }
    }
}
