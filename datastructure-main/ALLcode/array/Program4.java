import java.util.Arrays;
import java.util.Scanner;
/*Array printing using Array.toString Method */
public class Program4 
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }    
}
