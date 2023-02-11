import java.util.Scanner;

public class program2 
{
    public static void main(String[] args) {
        System.out.println("Enter the number ");
        boolean subha=false;
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int c=2;c<n;c++)
        {
            if(n%c==0)
            //% means modulo,4%2 here modulo is 0,if 9%2 the modulo is 1
            {
                subha=true;
                break;
            }
           
        }
            if(subha==true)//a=10 means the value is 10 will be assigned to the variable a//
            //when we use == operators ,is a relational operator and is used to find equality between operands /
            //a=10,b=20
            //if(a==b)
            //this will compare weather the values of a and b are equal or not //
            //If the value are equal it will return true ,else will return false// 
            
            
            
            {
                System.out.println("The numbe is not  prime");
            }
            else
            System.out.println("The number is   prime");
            s.close();
        
    }    
}
