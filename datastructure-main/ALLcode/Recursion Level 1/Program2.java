public class Program2
{
    public static void main(String[] args) 
    {
        funboth(5);   
    }   
    static void funboth(int n)
    {
        if(n==0)
        {
            return;
        }
        System.out.println(n);
        funboth(n-1);
        System.out.println(n);
    } 
}
