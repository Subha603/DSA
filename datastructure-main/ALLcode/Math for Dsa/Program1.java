public class Program1 
{
   public static void main(String[] args)
{
    int n=20;
    for(int i=0;i<n;i++)
    {
        System.out.println(i+" "+primenumber(i));
    }
} 

static boolean primenumber(int n)
{
    if(n==0)
    {
        return false;
    }
    int c=2;
    while(c*c<=n)
    {
        if(n%c==0)
        {
            return false;
        }
        c++;
    }
    return true;
    
}
}
