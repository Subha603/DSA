/*How to take String input using mathod in main function  
/*passing  String as a peremeter  */
public class Program7 
{
    public static void main(String[] args) 
    {
      String personalized=mygreet("subhjit kundu");
      System.out.println(personalized);
    } 
    static String mygreet(String name)
    {
        String message ="Hello"+name;
        return message;
    }       
}


