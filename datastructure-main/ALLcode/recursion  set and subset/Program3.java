public class Program3 
{
    public static void main(String[] args) 
    {
       System.out.println( skipAppnotApple("bApplccdh"));     
    }  
    static  String skipApple(String up)
    {
        if(up.isEmpty())
        {
          return "";
        } 
       
        if(up.startsWith("Apple"))
        {
           return skipApple(up.substring(5));
        }
        else
        {
           return up.charAt(0)+skipApple(up.substring(1));
        }
    
    }   

    
    static  String skipAppnotApple(String up)
    {
        if(up.isEmpty())
        {
          return "";
        } 
       
        if(up.startsWith("App") && !up.startsWith("Apple"))
        {
           return skipAppnotApple(up.substring(5));
        }
        else
        {
           return up.charAt(0)+skipAppnotApple(up.substring(1));
        }
    
    }   
   
}
