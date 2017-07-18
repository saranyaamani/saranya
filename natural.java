import java.io.*;
import java.util.*;
public class natural
{
public static void main(String args[])
{
int x,i=1;
int sum=0;
System.out.println("enter the no of items:");
Scanner scan=new Scanner(System.in);
x=scan.nextInt();
while(i<=x)
{
  sum=sum+i;
  i++;
  }
  System.out.println("sum of "+x" numbers is:"+sum);
  }
  }
   
