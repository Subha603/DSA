import java.util.Scanner;

public class Program7 
{
    public static void main(String[] args) 
    {
     System.out.println("Enter the Number");
     Scanner s=new Scanner(System.in);
     int num=s.nextInt();
     int ans=0;
     while(num>0)
     {
        int rem=num%10;
        num=num/10;
         ans=ans*10+rem;
     } 
     System.out.println(ans);  
     s.close();
    }    
}
