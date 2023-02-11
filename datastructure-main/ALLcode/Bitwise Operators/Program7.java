public class Program7
{
    /*count set bit means how many 1 is presentṇ  */
    public static void main(String[] args) 
    {
        int n=10;
        /*Integer.toBinaryString is the  binary rpresentation of a number */
        System.out.println(Integer.toBinaryString(n)); 
        System.out.println(setBits(n));
    }

    private static int setBits(int n) {
        int count=0;
        // while(n>0){
        //    count++;
        //    n-=n&(-n) ;
        // }

        /*Anothher way we can do it  */
        while(n>0){
            count++;
            n=n&(n-1);
        }

        return count;
    }    
}
