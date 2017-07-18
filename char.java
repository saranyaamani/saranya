import java.io.*;
import java.util.*;
public class char
{
public static void main (String args[])
{
char ch;
Scanner scan=new Scanner(System.in);
System.out.print("enter the character:");
ch=scan.next().charAt(0);
if((ch>='a' && ch<='z')||(ch>='A'&&ch<='z'))
{
System.out.println(ch+"is an alphabet");
}
else
{
System.out.println(ch+"is not a alphabet");
}
}
}
