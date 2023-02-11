import java.util.Scanner;

public class Sum
{ 
public static void main(String[] args) 
    {
    System.out.println("Enter the number");
    Scanner input= new Scanner(System.in);
    int n=input.nextInt();
    int m=input.nextInt();
    int sum=n+m;
    System.out.println("The sum value is "+sum);
        input.close();
    }
    
}
