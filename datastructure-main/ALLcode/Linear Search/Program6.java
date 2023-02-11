public class Program6
 {
    public static void main(String[] args) {
        //maximum in 2D array
        int arr[][]={
            {2,3,4},
            {34,56,1},
            {2,6,4,1},
            {45,2,67,98},

        };
       System.out.println(max(arr));
    }  
   
    static int max(int arr[][])
    {
        int max=Integer.MIN_VALUE;
       for(int row=0;row<arr.length;row++)
       {
           for(int col=0;col<arr[row].length;col++)
           {
               if(max<arr[row][col])
               {
                   max=arr[row][col];
               }
           }
       }
       return max;
    }  
}
