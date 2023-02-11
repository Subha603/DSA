
import java.util.Arrays;
/*variable argumenet */

public class Program21 
{
    public static void main(String[] args) 
    {
        fun(2,3,4,5,6,7);  
        multiple(2,3,"kunal"); 
    } 
    static void multiple(int a,int b,String ...v )
    {

    }  
    static void fun(int...v)//it basically takes arr of integer ,arr of String (which data type you take)
    //this is called variable lable argument
    {
        System.out.println(Arrays.toString(v));
    }
}
