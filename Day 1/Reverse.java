import java.lang.*;
import java.util.*;

public class Reverse
{
public static void main(String[] st)
{
Scanner scan=new Scanner(System.in);
	int no,rev=0,r;

System.out.print("\nENTER NO:");
no=scan.nextInt();

while(no>=1)
{
r=no%10;
rev=(rev*10)+r;
no=no/10;
}
System.out.print("\n\nREVERSE="+rev);
}}
 