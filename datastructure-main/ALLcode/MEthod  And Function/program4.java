import java.util.Scanner;

public class program4 
{
    public static void main(String[] args) 
    {
       int ans=sum2();
       System.out.println(ans);;
    }    
    static int sum2()//we add here int without using void 
    //because here we want to return integer value
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter The Number1");
        int num1=s.nextInt();
        System.out.println("Enter the number2");
        int num2=s.nextInt();
        int sum=num1+num2;
        return sum;//hrer return sum is give the value of the sum
        //return Basically means the function is end 
        //it means your work is done go to mane function .
        //after the return you write any statement that means the statement is unreachable and give an error
    }
}
