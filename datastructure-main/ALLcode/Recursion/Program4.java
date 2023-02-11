public class Program4 
{
    /*Write a function that takes in a number and print it */
    /*print first 5 number :1 2 3 4 5 */
    public static void main(String[] args) 
    {
        print(1);    
    }    
    static void print(int n)
    {
        /*if statement basically use for print limited number */
        if(n==5)
        {
            System.out.println(5);
            return ;
        }
        System.out.println(n);
        /*if you are calling a function again and agin ,you can treat it as a separate call in the stack */
        /*here we calling the function again an again 
         * this is call tail recursion 
         * this is the last function call
        */
        print(n+1);
    }
}
