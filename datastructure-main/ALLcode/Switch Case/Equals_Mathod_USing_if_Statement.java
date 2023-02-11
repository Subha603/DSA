import java.util.Scanner;

public class Equals_Mathod_USing_if_Statement 
{
    public static void main(String[] args) 
    {
       Scanner s=new Scanner(System.in);
       System.out.println("Enter The Fruit Name");
       String fruit=s.nextLine();
       if(fruit.equals("Mango"))
       {
         System.out.println("King of Fruit");
       }
       if(fruit.equals("Apple"))
       {
        System.out.println("A sweet Red Fruit");
       }
       s.close();
    }

}
