import java.util.Scanner;
/*how to take input 2D array in and print it*/
public class Program8 
{
 public static void main(String[] args) 
 {
    Scanner s=new Scanner(System.in);
    int[][]arr=new int [3][4];
    // System.out.println(arr.length);//number of rows input
     for(int row=0; row<arr.length;row++)
     {
         //for each col in every row
         for(int col=0;col<arr[row].length;col++)
         {
             arr[row][col]=s.nextInt();
         }
      }
      for(int row=0; row<arr.length;row++)
      {
          //for each col in every row
          for(int col=0;col<arr[row].length;col++)
          {
             // arr[row][col]=s.nextInt();
              System.out.print(arr[row][col]+" ");
          }
          System.out.println();
       }
     s.close();
 }   
 }    

