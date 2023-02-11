import java.util.Scanner;

public class program2 
{
    public static void main(String[] args) 
    {
        sum();
        sum();//if you call the fuction again and again your code is run again and again 
        
    } 
   static void sum()//here if you do not write static it means the method is non static .
   //if your main function or method is static it means which method you should creat that would be static.

    {
      Scanner s=new Scanner(System.in);
      System.out.println("Enter the number1");
      int num1=s.nextInt();
      System.out.println("Enter The number2");
      int num2=s.nextInt();
      int sum=num1+num2;
      System.out.println("The sum = "+sum);  

      s.close();
    }
    
}
