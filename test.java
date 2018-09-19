class Bank{
int getrateofinterest()
{
  return 0;
}
}
class SBI extends Bank{
 int getrateofinterest()
{
  return 8;
}
}
class ICICI extends Bank{
 int getrateofinterest()
{
  return 7;
}
}
class AXIS extends Bank{
 int getrateofinterest()
{
  return 9;
}
}
class test{
public static void main(String args[])
{
SBI s=new SBI();
ICICI i=new ICICI();
AXIS a=new AXIS();
System.out.println("SBI rateofinterest"+s.getrateofinterest());
System.out.println("ICICI rateofinterest"+i.getrateofinterest());
System.out.println("AXIS rateofinterest"+a.getrateofinterest());
}
}
