public class Program22 
{
    //function overloading
    public static void main(String[] args) {
       fun (67);
       fun("subhajit kundu");
    }   
    static void fun(int a){
        System.out.println(a);
    } 
    static void fun (String name)
    {
        System.out.println(name);
    }
    /*Two or more function is the same name and return type but the are different arguments */
    /*In compiled time it says that which function to be run */
}
