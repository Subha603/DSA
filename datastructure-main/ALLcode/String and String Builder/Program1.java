import java.util.Arrays;

public class Program1 
{
    /* */
    public static void main(String[] args) 
    {
           System.out.println(56);
           //anthing you can print in println method this is called toString method
            System.out.println( "kunal");
            //if you only print string it does not matter the data type 
            System.out.println(new int[]{2,3,4,5});
            /*this is an object . here we print the object 
             * the object will not print .here object will converted 
             * to string 
            */
            System.out.println(Arrays.toString(new int[]{2,3,4,5}));
           /*  for printing the object here we can use Arrays.toString  */
   
           Integer num=new Integer(56);
           System.out.println(num.toString());
        }    
}
