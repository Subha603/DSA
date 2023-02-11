import java.util.Arrays;
import java.util.Scanner;

public class Program14Swap 
{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int[] Array={2,3,4,5,6,7};
        Swap(Array, 0, 4);
        
        System.out.println(Arrays.toString(Array));
        } 
    static void Swap(int arr[],int index1,int index2)
    {
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }   
}
