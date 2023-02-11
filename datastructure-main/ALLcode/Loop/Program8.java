import java.util.Scanner;
public class Program8 
{
    public static void main(String[] args) 
    {
        int ans=0;
        Scanner s=new Scanner(System.in);
        while (true)
        {
            System.out.println("Enter the operators");
            char op=s.next().trim().charAt(0);
            if(op=='+'||op=='-'||op=='*'||op=='/'||op=='%')
            {
                System.out.println("Enter the numbers");
                int num1=s.nextInt();
                int num2=s.nextInt();
                if(op=='+')
                {
                    ans=num1+num2;
                }
                if(op=='-')
                {
                    ans=num1-num2;
                }
                if(op=='*')
                {
                    ans=num1*num2;
                }
                if(op=='%')
                {
                    ans=num1%num2;
                }
                if(op=='/')
                {
                    if(num2!=0)
                    {
                        ans=num1/num2;
                    }
                    else if(op=='x'||op=='X')
                    {
                        break;
                    }
                    else
                    {
                        System.out.println("Invalid Operation");
                    }
                }
                System.out.println(ans);

                
            }

        }

    }    
}
