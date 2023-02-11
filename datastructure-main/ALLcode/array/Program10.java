import java.util.Arrays;
import java.util.Scanner;
/*How to Take user input from 2D array and print */
public class Program10 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int [][] arr=new int [4][3];
       // int Array=s.nextInt();
        for(int row=0;row<arr.length;row++)
        {
            for(int col=0;col<arr[row].length;col++)
            {
                 arr[row][col]=s.nextInt();
            }
        }
        for(int[] a:arr)
        {
            System.out.println(Arrays.toString(a));
        }
    }
}
