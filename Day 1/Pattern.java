import java.util.*;

public class Pattern
{
 public static void main(String[] st)
{

Scanner scan=new Scanner(System.in);
	int n,i,j;
System.out.print("ENTER ROWS:");
n=scan.nextInt();

for(i=1;i<=n;i++)
{
	for(j=1;j<=i;j++)
	{
		System.out.print("*");
	}
System.out.print("\n");
}
}}
	 