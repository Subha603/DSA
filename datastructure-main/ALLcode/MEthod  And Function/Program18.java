public class Program18 
//Blocking Scoping using for loop 
{
    public static void main(String[] args) {
        for(int i=0;i<4;i++)
        {
            System.out.println(i);
        }
       // System.out.println(i);
       /*we cannot find the i in outside the for loop 
        we can acesses the i in the for loop  */
        /*The same things happing in the blocks */
    }    
}
