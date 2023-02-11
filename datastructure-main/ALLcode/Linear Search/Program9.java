public class Program9 
{
    public static void main(String[] args) {
        int a[][]={
            {1,2,3},
            {2,5,1},
            {3,1,1},

        };
        int ans=maximumwealth(a);
        System.out.println(ans);
    }
    public static int maximumwealth(int[][]accounts) 
    {//person=rol
        //account=col
        int ans=Integer.MIN_VALUE;
        for(int person=0;person<accounts.length;person++)
        {
            //when you start a new col,take a nw sum for that row
            int sum=0;
            for(int account=0;account<accounts[person].length;account++)
            {
                sum+=accounts[person][account];
            }
            //now we have some of account person
            //chack with overall answer
            if(sum>ans)
            {
                ans=sum;
            }
        }
        return ans;
    }   
}
