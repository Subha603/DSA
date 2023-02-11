public class Program16 
{
    /*Block scoping */
    public static void main(String[] args) {
        int a=10;/*already intialise outside the block in same method hence you cannot intialize again */

        int b=20;
       // int a=89;-->here also give me an error because we already initialize it
        {
          //  int a=78;
          /*This is block scop,give me error  because we all ready 
            initialize a you can change the value but you cannot modify the value */
            /*in the block scop the value already intialize then you cannot intialize */
            a=78;//reassign the original variable to some other value 
            System.out.println(a);//here also we can acesses the alue of a =78
            int c=99;
            //value initialised in this block will remain(print) in block
        }
       // System.out.println(c);/*cannot use outside the block */
       System.out.println(a);//but we can acces the value of a=78
    }    
}
