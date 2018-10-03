interface sturoll
{
void rollno();
}
interface stuname extends sturoll
{
void name();
}
interface stubranch extends sturoll
{
void branch();
}
class student implements stuname
{
public void rollno()
{
System.out.println("10005");
}
public void name()
{
System.out.println("Prince Christopher");
}
public void branch()
{
System.out.println("IT");
}
public static void main(String[]args)
{
 student s=new student();
	System.out.println("rollno:");
	s.rollno();
	System.out.println("name:");
	s.name();
	System.out.println("branch:");
	s.branch();
}
}

