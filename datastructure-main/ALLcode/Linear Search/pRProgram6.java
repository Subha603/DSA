

public class pRProgram6 
{
    public static void main(String[] args) {
        int arr[][]={
            {2,3,4},
            {34,56,1},
            {2,6,4,1},
            {45,2,67,98},
    };   
    
    System.out.println(min(arr)); 
}
static int min(int arr[][])
{
    int min=Integer.MIN_VALUE;
    for(int row=0;row<arr.length;row++)
    {
        for(int col=0;col<arr[row].length;col++)
        {
            if(arr[row][col]<min)
            {
                min =arr[row][col];
            }
        }
        
    }
    return min;
}
}
