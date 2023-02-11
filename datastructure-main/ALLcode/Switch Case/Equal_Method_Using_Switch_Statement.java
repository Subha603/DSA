import java.util.Scanner;

public class Equal_Method_Using_Switch_Statement 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        String fruit=s.nextLine();
        System.out.println();
        switch(fruit)
        {
            case"Mango":
            System.out.println("King Of fruits");
            break;
            case"Apple":
            System.out.println("Sweet Red Fruit");
            break;
            case"Orange":
            System.out.println("Round fruit");
            break;
            case"Grapes":
            System.out.println("Smalls Fruit");
            break;
            default:
            System.out.println("Please enter a Valid Fruit");

        }
        s.close();
    }
}
