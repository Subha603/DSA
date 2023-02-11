
import java.util.Scanner;

public class program4 {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int c=2;
        boolean subha=false;
        if(n<=1)
        {
            System.out.println("The number is nethir prime or composit");
        }
        while(c*c<=n)
        {
            if(n%c==0)
            {
                subha=true;
            }
            c=c+1;
        }
        if(subha==true)
        {
            System.out.println("Enter the number is not prime");
        }
        else
        {
            System.out.println("The number is prime");
        }
        s.close();
    }
    
}
