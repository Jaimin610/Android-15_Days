import java.util.*;

public class ReverseStr
{
public static void main(String[] st)
{
Scanner scan=new Scanner(System.in);
	String s;

System.out.println("ENTER STRING: ");
s=scan.next();

System.out.print("STRING: "+s);

int l=s.length();
String rev="";

for(int i=l-1;i>=0;i--)
{
rev=rev+s.charAt(i);
}
System.out.println("\n REVERSE= "+rev);

}}
