public class Program6 
{
    // How to get Ascii value
    // public static void main(String[] args) {
    //     char ch='a';
    //     System.out.println((char)ch+0);
    // }

    public static void main(String[] args) 
    {
        subseqAscii("", "abc");
        
    }
    static void subseqAscii(String string,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(string);
            return;
        }
        char ch=up.charAt(0);
        subseqAscii(string+ch,up.substring(1));
        subseqAscii(string,up.substring(1));
        subseqAscii(string+(ch+0),up.substring(1));
    }
}
