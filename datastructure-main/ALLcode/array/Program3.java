
import java.util.Scanner;


public class Program3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
    
    int []arr=new int[5];
    // arr[0]=23;
    // arr[1]=446;
    // arr[1]=346;
    // arr[1]=4678;
    // arr[1]=4556;
    //(23,45,233,543,3)
   // System.out.println(arr[5]);
    /*First for loop taken the input and store the index */
  for  (int i=0;i<arr.length;i++)
    {
        arr[i]=s.nextInt();
    }
    /*2nd for loop for the print the value */
    // for  (int i=0;i<arr.length;i++)
    // {
    //    System.out.println(arr[i]);
    // }
    for(int num:arr)//This is the for each loop 
    //for every element in array ,print the elemenet 
    {
       System.out.print(num+" ");//here num represents elements of the array

    }
    }

}
