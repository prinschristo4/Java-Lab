import java.io.*;
    import java.util.*;
    import java.util.Scanner;

     public class salary{
            static Scanner console=new Scanner(System.in);
              public static void main (String args[])  { 

              String name = "";
              int kindOfEmployee;
              int overtimePay = 0;
              int HRate = 0;
              int HWorked = 0;
              int regularPay = 0;
              int overtimeRate = 0;
              int overtimeHours = 0;
              int Income = 0;

              Scanner input = new Scanner(System.in);

              System.out.println("Enter Name of the employee:");
              name = console.next ();
              System.out.println("1]Part-time Employee");
              System.out.println("2]Full-time Employee");
              System.out.println("Choose what kind of employee?");
              kindOfEmployee=console.nextInt();

              System.out.println("Hourly Rate:");
              HRate = input.nextInt();
              System.out.println("Hours Worked:");
              HWorked = input.nextInt();
              System.out.println("Regular Pay:");
              regularPay = input.nextInt(); 
              System.out.println("Overtime Rate:");
              overtimeRate = input.nextInt();
              System.out.println("Overtime Hours:");    
              overtimeHours = input.nextInt();   
              overtimePay = overtimeRate*overtimeHours;

              System.out.println("Name of the employee: "+name);
              System.out.println("Income: "+Income);

              if (kindOfEmployee == 1){
                  Income = HRate*HWorked;            
                       }
              if (kindOfEmployee == 2){
                   Income = regularPay+overtimePay;     
                    }
            }
        }

