public class Program8 
{
    /*range of xor */
    public static void main(String[] args) 
    {
        /*find the range xor from a to b */
        //range xor for a,b=xor(b)^xor(a-1)
        int a=3;
        int b=9;
        int ans=xor(b)^xor(a-1);
        System.out.println(ans);
        /*Only for chack will give time limit exit for large number */
        int ans2=0;
        for(int i=0;i<=b;i++)
        {
            ans2^=i;
        }
    }
        //this give xor from 0 to a
        static int xor(int a)
        {
            if(a%4==0)
            {
                return a;
            }
            if(a%4==1)
            {
                return 1;
            }
            if(a%4==2)
            {
                return a+1;
            }
           return 0;
        }
     
}

