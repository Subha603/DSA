import java.util.Scanner;

public class Program6 
{
    public static void main(String[] args) 
    {
        int count=0;
        //int n=34353433;
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n=s.nextInt();
        while(n>0)   
        {
            int rem=n%10;
            if(rem==3)
            {
                count++;
            }
            n=n/10;
        } 
        System.out.println(count);
        s.close();
    }    
}
