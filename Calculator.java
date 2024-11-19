import java.util.*;
public class Calculator
{
 public static void main(String args[])
 {
  Scanner sc=new Scanner(System.in);
  
    System.out.println("Enter value of num1 :");
     double num1=sc.nextDouble();
 
    System.out.println("Enter value of num2 :");
     double num2=sc.nextDouble(); 
 
	System.out.println("Enter any operation(+, -, /, *): ");
     char arithoperators=sc.next().charAt(0);
	  
	  double sum;
	 
       switch(arithoperators)
	  {
	   case'+':
	    sum=num1+num2;
	    System.out.println("Value of addition: " + sum);
	   break;

	   case'-':
	    sum=num1-num2;
	    System.out.println("Value of subtraction: " + sum);
	   break;
	   
	   case'/':
	   if(num2!=0)
	  {
	    sum=num1/num2;
	    System.out.println("Value of Division: " + sum);
	  }
	   else
	   {
	     System.out.println("error:division by zero is not allowed");
	   }	
      break;
		
	  case'*':
	   sum=num1*num2;
	   System.out.println("Value of multiplication: " + sum);
	   break;
	   
	   default:
	   System.out.print("Its not an arithoperators");
	   break;
	 } 
	  sc.close();
  }
}  