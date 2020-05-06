import java.util.Scanner;
import java.util.Stack;

public class ReversingAString {
public static String StringReverser(String str) {
    char[] a = str.toCharArray();

    Stack<Character> myStack = new Stack<Character>();
    for (int i = 0; i < a.length; i++) {
        myStack.push(a[i]);


    }
    var result = new char[a.length];

    int i =0;
    while (!myStack.isEmpty())
    {
       result[i]=myStack.pop();
        i++;
    }
    return  new String(result);
}
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
       String input=scan.nextLine();
       System.out.println(StringReverser(input));
    }






}
