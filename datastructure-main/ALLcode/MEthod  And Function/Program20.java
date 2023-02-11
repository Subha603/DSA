public class Program20 
{
    static int x=90;//when we write int x=40 this line will be shadowed
    public static void main(String[] args) {
        System.out.println(x);//print 90
        int x=40;
        System.out.println();//print 40
        fun();
        
    }    
    static void fun()
    {
        System.out.println(x);
        /*shadowing to not in method  */
    }
}
