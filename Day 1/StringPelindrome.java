import java.util.*;

public class StringPelindrome
{
public static void main(String[] st)
{
Scanner scan=new Scanner(System.in);
	String s1;

System.out.println("ENTER STRING: ");
s1=scan.next();

System.out.print("STRING: "+s1);

StringBuffer sb=new StringBuffer(s1);
String t=""+sb.reverse();

if(s1.equals(t))
{
System.out.println("\n IT IS PELINDROME");
}
else
{
System.out.println("\n IT IS NOT PELINDROME");
}
 
}}