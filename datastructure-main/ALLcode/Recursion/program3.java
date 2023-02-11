public class program3 
{
    /*Write a function that takes in a number and print it */
    /*print first 5 number  1 2 3 4 5*/
    public static void main(String[] args) {
        
    
    /*-------------------1st  type main function -------------- */
        // print1(1);
        // print1(2);
        // print1(3);
        // print1(4);
        // print1(5);
        /*-----------------2nd type---------------------------- */

        print1(1);

        }

       /*------------------------1st type---------------------- */
    //    static void print1(int n)
    //    {
    //     System.out.println(n);
    //    } 

        /*--------------------------2nd type-------------------- */
        static void print1(int n)
        {
            System.out.println(n);
            print2(2);
        }
        static void print2(int n)
        {
            System.out.println(n);
            print3(3);
        }
        static void print3(int n)
        {
            System.out.println(n);
            print4(4);
        }
        static void print4(int n)
        {
            System.out.println(n);
            print5(5);
        }
        static void print5(int n)
        {
            System.out.println(n);
            
        }
    /*go to next program and see the recursion  */


}
