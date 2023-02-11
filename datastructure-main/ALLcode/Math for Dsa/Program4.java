import java.util.ArrayList;

public class Program4 
{
    /*Time complexcity O(n);
     * space Complexcity O(n);
     */
    public static void main(String[] args) 
    {
        /*find the factors of a number*/
        
      // factors1(20);    
      // factors2(20);  
      factors3(20);
    }   
    static void factors1(int n)
    {
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                System.out.print(i+" ");
            }
        }
    }
    // Time complexcity-O(sqrt(n))
    static void factors2(int n)
    {
        for(int j=1;j<=Math.sqrt(n);j++)
        {
            if(n%j==0)
            {
                if(n/j==j)
                {
                    System.out.print(j+" ");
                }
                else
                {
                    System.out.print(j+" "+n/j+" ");
                }
            }
        }
    }
    //both time and space complexcity is squrt(n);
    static void factors3(int n)
    {
        ArrayList<Integer>str=new ArrayList<Integer>(n);
        for(int i=1;i<=n;i++)
        {
            if(n%i==0)
            {
                
                if(n/i==i)
                {
                    System.out.print(i+" ");

                }
            
            else
            {
                System.out.print(i+" ");
            str.add(n/i);
            }
        }
    }  
    
    for(int i=0;i<str.size()-1;i--)
    {
        System.out.println(str.get(i));
    }
}


}
