public class program5 
{
    //return String
    public static void main(String[] args) {
        String message =greet();
        System.out.println(message);

    }   
    static String  greet()//if you mantion any return type in mathod
    // you want to return only mantion type do not return anything 
    //like here we write string but you return int then give error  
    {
        String  greeting="How are you ";
        return greeting;
        
    } 
    /*return_type name(arguments) 
     * {
     *  body
     * return statement;
     * }
     */
}
