public class Wrapper 
{
    public static void main(String[] args) {
        /*here swapping not work because java only call by value not call buy reference
         * for using call by reference we use the object 
         */
    //  int a=10;
    //  int b=20; 
    //  Swap(a, b); 
    //  System.out.println(a+" "+b); 
    // }
    // static void Swap(int a,int b)
    // {
    //     int temp=a;
    //     a=b;
    //     b=temp;





    /*In the below code Integer  create the object(if you  right here a.somthing(when Integer a) 
    then you can see so many class so it cll wrapper class)but it is not run because here Integer is the final keyword so here also not swap*/

    Integer a=10;
    Integer b=20;
    swap(a,b);
    System.out.println(a+" "+b);

    }

    static void swap(Integer a, Integer b) 
    {
        int temp=a;
        a=b;
        b=temp;

    }
}
