public class princel1
{
    public static void main(String args[])
    {
      int num1=60;
      if( num1 < 50 )
         {
	  System.out.println("number is less than 50");
         }
      else
	 {
	  System.out.println("invalid number");
	 }
  
     int num2=2;
     switch(num2+2)
     {
        case 1:
	  System.out.println("Case1: Value is: "+num2);
	break;
	case 2:
	  System.out.println("Case2: Value is: "+num2);
	break;
	case 3:
	  System.out.println("Case3: Value is: "+num2);
	break;
        default:
	  System.out.println("Default: Value is: "+num2);
        break;
     }
     
      int i=10;
         while(i>1){
              System.out.println(i);
              i--;
         }

         int j=10;
         do{
              System.out.println(i);
              j--;
         }
	 
         while(j>1);

    
         for(i=10;i>1;i--)
              {
              System.out.println("The value of i is: "+i);
              }
     }
}
