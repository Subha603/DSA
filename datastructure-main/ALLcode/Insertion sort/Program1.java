import java.util.Arrays;

public class Program1 
{
    public static void main(String[] args) {
        int arr[]={3,5,1,2,8,6};
        for(int i=0;i<3;i++){
            int current=arr[i];
            int j=i-1;
            while(j>=0 && current<arr[j])
            {
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        System.out.println(Arrays.toString(arr));
    }    
}
