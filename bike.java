class Car
{
  public void run()
  {
   System.out.println("Car is running");
  }
}
class bike extends Car
{
public void run()
  {
  System.out.println("Bike is running fast");
  }
public static void main(String args[])
  {
  bike obj=new bike();
       obj.run();
  }
}
