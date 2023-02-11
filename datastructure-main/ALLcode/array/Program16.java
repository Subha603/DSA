public class Program16 {
    public static void main(String[] args) {
        int arr[]={1,3,23,9,18};
        System.out.println(maxRange(arr,1,3));    
        }
       
    
        //imagine that array is not empty 
        static int  maxRange(int []arr,int Start,int End)
        {
        if(End>Start)
        {
            return -1;
        }
        if(arr==null)
        {
            return -1;
        }
        
            int max=arr[Start];
            for(int i=Start;i<=End;i++)
            {
                if(arr[i]>max)
                {
                max=arr[i];
                }
            }
           return max; 
        }
}
