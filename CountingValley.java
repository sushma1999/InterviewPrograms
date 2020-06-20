import java.util.*;

public class CountingValley {
    static int countingValleys(int n, String s) {
        int level = 0;
        int valleys = 0;
        boolean belowSea = false;
        if (n>=2 && n<=1000000){
            if(n==s.length()){
                for(int i = 0; i < n; i++)
                {
                    char slope = s.charAt(i);
                    if(slope == 'U' || slope =='D'){
                        if(slope == 'U')//Uphill
                        { level++; }
                        else//Downhill
                            level--;

//Handle transitions
                        if(!belowSea && level < 0)
                        {
                            valleys++;
                            belowSea = true;
                        } else

                        if(level == 0 && slope =='U'){//We are back above sea level
                            belowSea = false;
                        }
                    }
                }
            }
        }
        return valleys;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String s = scanner.nextLine().trim();
        int result = countingValleys(n, s);
        System.out.println(result);

    }
}