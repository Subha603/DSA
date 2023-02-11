public class Program14 
{
    /*Scoping  */
    /* Socping basically means where do i ascess a variable */
    public static void main(String[] args) 
    {
         int a=10;
         int b=20;  
        // System.out.println(num);//we do not access it here in the method  
      // System.out.println(marks);
    }
    static void random(int marks)
    {
        int num=67;
        System.out.println(num);//this is the function scop
        System.out.println(marks);
    }
   
}
