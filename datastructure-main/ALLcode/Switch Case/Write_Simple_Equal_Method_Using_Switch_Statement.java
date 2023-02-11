import java.util.Scanner;

public class Write_Simple_Equal_Method_Using_Switch_Statement 
{
    public static void main(String[] args) 
    {
        Scanner S=new Scanner(System.in);
        System.out.println("Enter The Fruit");
        String fruit=S.next();
        switch(fruit) 
        {
            case "Mango"->System.out.println("King Of fruits");
            case "Apple"->System.out.println("Sweet Red Fruit");
            case "orange"->System.out.println("Round fruit");
            case "Grapes"->System.out.println("Smalls Fruit");
            default->System.out.println("Please enter a Valid Fruit");
        } 
        S.close();  
    }    
}
