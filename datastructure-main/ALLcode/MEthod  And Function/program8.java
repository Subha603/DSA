import java.util.Scanner;

/*How to take user input  String  using method in function */
public class program8 
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter your name");
        String name =s.next();
        String personalised=mygreet(name);
        System.out.println(personalised);    
    }

    private static String mygreet(String name) {
        String message="hello"+name;
        return message;
    }    
}
