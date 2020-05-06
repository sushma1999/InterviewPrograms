import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class NestedLogic {
    public static void main(String[] args) {
Scanner scanner= new Scanner(System.in);
int fine;
int actualDate=scanner.nextInt();
int actualMonth=scanner.nextInt();
int actualYear=scanner.nextInt();
int ExpectedDate=scanner.nextInt();
int ExpectedMonth=scanner.nextInt();
int ExpectedYear=scanner.nextInt();
if(actualYear>ExpectedYear)
{
 fine=10000;
}
else if(actualMonth>ExpectedMonth && actualYear==ExpectedYear)
{
    fine=500*(actualMonth-ExpectedMonth);
}else if(actualDate>ExpectedDate && actualMonth==ExpectedMonth )
{
    fine=15*(actualDate-ExpectedDate);
}
else
{
    fine=0;
}
System.out.println(fine);
    }
}