
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class BalancedBrackets{

    private final List<Character> leftBrackets
            = Arrays.asList('(', '<', '[', '{');
    private final List<Character> rightBrackets
            = Arrays.asList(')', '>', ']', '}');

    public boolean isBalanced(String input) {
        Stack<Character> stack = new Stack<>();

        for (char ch : input.toCharArray()) {
            if (isLeftBracket(ch))
                stack.push(ch);

            if (isRightBracket(ch)) {
                if (stack.empty()) return false;

                var top = stack.pop();
                if (!bracketsMatch(top, ch)) return false;
            }
        }

        return stack.empty();
    }

    private boolean isLeftBracket(char ch) {
        return leftBrackets.contains(ch);
    }

    private boolean isRightBracket(char ch) {
        return rightBrackets.contains(ch);
    }

    private boolean bracketsMatch(char left, char right) {
        return leftBrackets.indexOf(left) == rightBrackets.indexOf(right);
    }
public static void main(String[] args)
{
    Scanner scan = new Scanner(System.in);
    int n= scan.nextInt();
  scan.nextLine();
    String input="";
    for(int i=0;i<n;i++)
    {
        input= scan.nextLine();
        BalancedBrackets balanced = new BalancedBrackets();
        System.out.println(balanced.isBalanced(input));

    }

}
}
