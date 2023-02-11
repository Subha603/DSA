import java.util.Scanner;


public class Program5_fibonacci_number {
   public static void main(String[] args) {
       System.out.println("Enter the number");
       Scanner s=new Scanner(System.in);
       int n=s.nextInt();


     int i=1;
        int p=0;
        int count=2;
        while(count<=n)
        {
           int temp=i;//temp=1
           i=i+p;//i=1+0
            p=temp;//p=1;
            count++;//2,3,4,5...n
       }
       System.out.println(i);
       s.close();
       }
      
   } 

