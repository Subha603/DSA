public class Program19 
{
    /*Shadowing */
    static int x=90;/*here we use static becase wecannot use object dependent thing in the object Independent things */
    //int x is avalabil in the block of x 
    public static void main(String[] args) {
        System.out.println(x);
        fun();
    }
    static void fun()
    {
        System.out.println(x);//here we do not get any error 
    }
}
