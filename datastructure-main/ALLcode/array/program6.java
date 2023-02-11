import java.util.Arrays;
import java.util.Scanner;

public class program6 {
    //passing the index in function and method//
    public static void main(String[] args) {
        int[] nums=new int[4];
        Scanner s=new Scanner(System.in);
       for(int i=0;i<nums.length;i++)
       {
        nums[i]=s.nextInt();
       }

        System.out.print(Arrays.toString(nums));
        change(nums);
        System.out.println(Arrays.toString(nums));   
    }
    static void change(int[] Arrays)
    {
        Arrays[0]=99;
    }
    //Array are mutable ;
    //String are immutable 
}
