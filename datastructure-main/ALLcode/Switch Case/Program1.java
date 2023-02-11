import java.util.Scanner;

public class Program1
 {
    public static void main(String[] args) 
    {
        // Scanner S=new Scanner(System.in);
        // System.out.println("Enter The Number");
        // int Day=S.nextInt();
        // switch(Day)
        // {
        //     case 1,2,3,4 ->System.out.println("Weekday");
        //     case 6,7->System.out.println("Weekend");
        // }   
        // S.close();
        Scanner S=new Scanner(System.in);
        System.out.println("Enter The Number");
        int Day=S.nextInt();
        switch(Day)
        {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            System.out.println("Weekday");
            break;
            case 6:
            case 7:
            System.out.println("Weekend");
            break;
        }
        S.close();
    }   
}
