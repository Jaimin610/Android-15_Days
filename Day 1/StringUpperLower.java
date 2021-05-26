import java.util.*;

public class StringUpperLower
{
public static void main(String[] st)
{
Scanner scan=new Scanner(System.in);
String str,data="";
int i;
System.out.println("ENTER STRING: ");
str=scan.nextLine();

System.out.println("\nSTRING: "+str+"\n");

for(i=0;i<str.length();i++)
{
	char ch=str.charAt(i);
	if(ch>=65 && ch<=90)
	{ch=(char)(ch+32);}
	else if(ch>=97 && ch<=122)
	{ch=(char)(ch-32);}
	data=data+ch;
}
System.out.println("\nCONVERTED: "+data);
}}