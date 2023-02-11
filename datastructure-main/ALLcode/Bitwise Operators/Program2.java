public class Program2 
{
    public static void main(String[] args) 
    {
        int arr[]={2,3,4,1,2,1,3,6,4};
        System.out.println(FindUnique(arr));    
    }

     static int  FindUnique(int arr[]) 
    {
        int unique=0;
        for(int n:arr)
        {
        unique^=n;
        }
        return unique;
    }    
}
