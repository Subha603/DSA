import java.util.Scanner;

public class Calculate_Day_Switch_Statement 
{
    public static void main(String[] args) {
        
    
    Scanner s=new Scanner(System.in);
    System.out.println("Enter The Number");
    int Day=s.nextInt();
   
    switch(Day)
    {
        case 1->System.out.println("Monday");
        case 2->System.out.println("Tuesday");
        case 3->System.out.println("Wednesday");
        case 4->System.out.println("Thursday");
        case 5->System.out.println("Friday");
        case 6->System.out.println("Saturday");
        case 7->System.out.println("Sunday");
    }
    s.close();

    }

}
