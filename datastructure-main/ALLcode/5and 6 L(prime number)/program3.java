
import java.util.Scanner;

public class program3
{
   

    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner s=new Scanner(System.in);
        boolean subha=false;
      
        int n=s.nextInt();
        int c=2;
        while(n>c)
       {
           if(n%c==0)
           {
                subha=true; 
                break;  
            }
            c=c+1;
            
        }
        if(subha==true)
        {
     System.out.println("the number is not   prime");
        }
        else
        System.out.println("The is number is prime");
     s.close();
    }   
    
}
