import java.util.*;
class Customexception extends Exception
{
  Customexception()
{
System.out.println("You have failed");
}
}
class demo1
{
public static void main(String[]args)
{
Scanner b=new Scanner(System.in);
System.out.println("Enter the Subject");
String a=b.next();
System.out.println("Enter your marks");
String d=b.next();
try
{
if(a.equals("Java")&&d.equals("60"))
{
System.out.println("You have passed");
}
else
{
throw new Customexception();
}
}
catch(Exception e)
{
System.out.println();
}
}
}
