import java.util.Scanner;

public class program1 
{
    public static void main(String[] args) {
        System.out.println("Enter the salary");
        Scanner s=new Scanner(System.in);
        int salary=s.nextInt();
        if(salary>10000)
        {
            salary=salary+2000;
            System.out.println(salary);
        }
        else
        {
            salary=salary+1000;
            System.out.println(salary);
        }
        s.close();
    }
}
