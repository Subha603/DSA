public class Program3
 {
    public static void main(String[] args) {
        int arr[]={18,12,-7,3,14,28};
        int target=12;
        System.out.println(search(arr, target, 1, 4));
        
    }
    static int search(int []arr,int target,int start,int end)
    {
        if(arr.length==0)
        {
            return -1;
        }
        for(int index=start;index<=end;index++)
        {
            //chack for the every index if it is=target
            int element=arr[index];

            if(element==target)
            {
                return index;
            }
        }
        //this line will execute if none of the return 
        //hence the target not found 
        return -1;
    }  
}
