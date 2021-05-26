import java.util.*;

public class Prime
{
 public static void main(String[] st)
{

Scanner scan=new Scanner(System.in);
	int no,i=2,f=0;
System.out.print("ENTER NO:");
no=scan.nextInt();

while(i<no)
{
	if(no%i==0)
	{
		f=1;
		break;
	}
i++;
}

if(f==1)
{
	System.out.println("\n IT IS NOT A PRIME");
}
else
{
	System.out.println("\n IT IS A PRIME");
}
}}
	