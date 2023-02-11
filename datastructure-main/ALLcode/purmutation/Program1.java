public class Program1
{
    public static void main(String[] args) {
        purmutation("", "abc");
    }   
    static void purmutation(String p,String up)
    {
        if(up.isEmpty())
        {
            System.out.println(p);
            return ;
        }
        char ch=up.charAt(0);
        for(int i=0;i<p.length();i++)
        {
            String f=p.substring(0, i);
            String s=p.substring(i,p.length());
            purmutation(f+ch+s, up.substring(1));
        }
    }
}
