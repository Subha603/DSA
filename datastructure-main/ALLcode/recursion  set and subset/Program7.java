
import java.util.ArrayList;

public class Program7 
{
    public static void main(String[] args) 
    {
        System.out.println(subseqAsciiRet("", "abc"));
    }  
    static ArrayList<String>subseqAsciiRet(String p,String up)
    {
        if(up.isEmpty())
        {
            ArrayList<String>list= new ArrayList<String>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);
        ArrayList<String>first=subseqAsciiRet(p+ch,up.substring(1));
        ArrayList<String>Second=subseqAsciiRet(p,up.substring(1));
        ArrayList<String>third=subseqAsciiRet(p+(ch+0),up.substring(1));
        first.addAll(Second);
        first.addAll(third);
        return first;
    }
}