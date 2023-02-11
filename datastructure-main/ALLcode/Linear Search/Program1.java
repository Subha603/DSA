public class Program1 {
public static void main(String[] args) {
    int []nums={23,45,1,2,8,19,-3,16,11,28};
    int target=19;
    int ans=linearsearch(nums, target);
    System.out.println(ans);
}
//search the array:return the index item if item found
//otherwise if item not found return-1
static int linearsearch(int[] arr,int target)
{
    if(arr.length==0)
    {
        return 1;
    }
    //run a for loop
    for(int index=0;index<arr.length;index++)
    {
        //chack for element for every index if it is a terget
        int element =arr[index];
        if(element==target)
        {
            return index;
        }
    }
   // this line will execute if none of the return statements above have executed 
   //hence the terget not found
    return -1;
}
}
