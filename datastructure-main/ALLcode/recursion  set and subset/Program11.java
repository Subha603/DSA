import java.util.ArrayList;

public class Program11 
{
    public static void main(String[] args) 
    {
        ArrayList<String>ans=permutationsList(" ", "abc");
        System.out.print(ans);
    }
    static ArrayList<String> permutationsList(String p,String up)
    {
        if(up.isEmpty())
        {
            //Local to this call 
            ArrayList<String>list=new ArrayList<>();
            list.add(p);
            return list;
            
           
        }
        int count=0;
        char ch=up.charAt(0);
        ArrayList<String>ans=new ArrayList<>();
        for(int i=0;i<p.length();i++)
        {
            String f=p.substring(0,i);
            String s=p.substring(i,p.length());
            ans.addAll(permutationsList(f+ch+s, up.substring(1)));
            

        }
        return ans;
        
    }
}
