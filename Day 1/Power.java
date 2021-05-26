import java.lang.*;
import java.util.*;

public class Power
{
public static void main(String[] st)
{
Scanner scan=new Scanner(System.in);
	int x,n,p=1,i=1;

System.out.print("\nENTER 2 NO:");
x=scan.nextInt();
n=scan.nextInt();

while(i<=n)
{
p=p*x;
i++;
}
System.out.print("\n\n POWER="+p);
}}
 