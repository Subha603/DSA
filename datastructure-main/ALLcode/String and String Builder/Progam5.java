import java.lang.module.ModuleDescriptor.Builder;

public class Progam5 
{
    public static void main(String[] args) 
    {
        StringBuilder bulider =new StringBuilder();  
        for(int i=0;i<36;i++)
        {
            char ch=(char)('a'+i);
            bulider.append(ch);
        }
        /*This not created new object this is just change the object */
        System.out.println(bulider.toString());
        /*use for delet the char in a particular index  */
        bulider.deleteCharAt(0);
        System.out.println(bulider);
        /*basically use for reverse the String */
        bulider.reverse();
        System.out.println(bulider);
    }
}
