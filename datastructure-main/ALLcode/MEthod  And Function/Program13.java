import java.util.Arrays;

public class Program13
 {
     public static void main(String[] args) {
         int[] arr={2,3,45,6,7};
         changearr(arr);
         System.out.println(Arrays.toString(arr));//if you do not write Array.toString then print the reference variable of the array(location index)
     }  
      static void changearr(int nums[])
      {
         nums[0]=99;/*if you change the to the object via this ref
         variable same object will be changed */
      } 
    // public static void main(String args[])
    // {
    //     int[] arr={2,3,4,5,6};
    //     System.out.println(Arrays.toString(arr));
    // }
}
