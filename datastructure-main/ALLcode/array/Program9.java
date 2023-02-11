import java.util.Arrays;
import java.util.Scanner;

public class Program9 {
    /*How to Take input in two dimensonal array */
    
   public static void main(String[] args) {
    int[][] arr=new int [3][3];
    Scanner s=new Scanner(System.in);
    System.out.println(arr.length);//no of rows
    //for input
    for(int row=0;row<arr.length;row++)
    {
        for(int col=0;col<arr[row].length;col++)
        {
            arr[row][col]=s.nextInt();
           
        }
    }
    //for output
    // for(int row=0;row<arr.length;row++)
    // {
    //     for(int col=0;col<arr[row].length;col++)
    //     {
    //        System.out.print(arr[row][col]+" ");
           
    //     }
    //     System.out.println();
    // }
    //Another way take output
   for(int row=0;row<arr.length;row++)
    {
    System.out.println(Arrays.toString(arr[row]));
       }
      System.out.println(Arrays.deepToString(arr));
   } 
}
