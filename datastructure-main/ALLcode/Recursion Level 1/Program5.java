public class Program5 
{
    /*product of digit */
    /*prod of digit means=5*0*5=0 */
    public static void main(String[] args) 
    {
        int ans=prod(24);
        System.out.println(ans);
    }
    static int prod(int n)
    {
        if(n%10==n)
        {
            return n;
        }
        return(n%10)*prod(n/10);
    }
}
