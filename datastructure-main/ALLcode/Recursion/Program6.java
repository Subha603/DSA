import java.lang.annotation.Target;

public class Program6 
{
    public static void main(String[] args)
    {
        int arr[]={23,54,12,6,87,9,69};
        int target=69;
        System.out.println( BinarySearch(arr,target,0,arr.length-1));
        
    }   
    static int BinarySearch(int arr[],int target,int f,int l)
    {
        f=0;
        l=arr.length-1;
        if(l<f)
        {
            return -1;
        }
        int m=f+(l-f)/2;
        if(arr[m]==target)
        {
            return m;
        }
        if(arr[m]>target)
        {
            return BinarySearch( arr,target,f,m-1);
        }
        return BinarySearch( arr,target,m+1,l);

    } 
}
