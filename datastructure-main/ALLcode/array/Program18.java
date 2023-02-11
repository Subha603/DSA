import java.util.Arrays;

public class Program18 {
    
    public static void main(String[] args) {
        int arr[]={10,20,65,34,21};
        reversed(arr);
        System.out.println(Arrays.toString(arr));
}
static void reversed(int[] arr)
{
    int Start =0;
    int End=arr.length-1;
    while(Start<End)
    {
        swap(arr,Start,End);
        Start++;
        End--;
    }
}
private static void swap(int[] arr, int start, int end) {
    int temp=arr[start];
    arr[start]=arr[end];
    arr[end]=temp;
}

}
