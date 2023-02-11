public class Program2 
{
public static void main(String[] args) {
    //Order agnositc binary Search 
    //int []arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
    int arr[]={89,45,22,18,16,15,12,4,2,0,-23,-56,-98};
    int target=22;
    int ans=agnosticBS(arr, target);
    System.out.println(ans);
}   
static int agnosticBS(int[] arr,int target)
{
    int start=0;
    int end =arr.length-1;
    //Find whether the array is sorted in ascending or descending
    boolean isAsc=arr[start]<arr[end];
    // if(arr[start]<arr[end])
    // {
    //     isAsc=true;
    // }
    // else{
    //     isAsc=false;
    // }
    while(start<=end)
    {
        //find the middle element 
        //int mid=(start+end)/2;//might be possible that (start+end)exceeds the range of int in java
        int mid=start+(end-start)/2;
        if(target==arr[mid])
        {
            return mid;
        }
        if(isAsc)
        {
            if(target<arr[mid])
            {
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
            else{
                if(target>arr[mid])
                {
                    end=mid-1;
                }
                else
                {
                    start=mid+1;
                }
            }
        
        // if(target<arr[mid])
        // {
        // end=mid-1;
        // }
        // else if(target>arr[mid])
        // {
        //     start=mid+1;
        // }
        // else{
        //     return mid;
        // }

        // }
        // return -1;
    }
    return -1;
}
} 

