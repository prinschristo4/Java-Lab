class hos{
int getnoofpatients()
{
  return 0;
}
}
class Apollo extends hos{
 int getnoofpatients()
{
  return 500;
}
}
class Baptist extends hos{
 int getnoofpatients()
{
  return 1000;
}
}
class Manipal extends hos{
 int getnoofpatients()
{
  return 2000;
}
}

class hospital{
public static void main(String args[]){

Apollo s=new Apollo();
Baptist i=new Baptist();
Manipal a=new Manipal();
System.out.println("Apollo patient number "+s.getnoofpatients());
System.out.println("Baptist patient number"+i.getnoofpatients());
System.out.println("Manipal patient number"+a.getnoofpatients());
}}





