public class Subha 
{
     static void Swap(int m,int n) 
    {
        int tepm=m;
        m=n;
        n=tepm;
        System.out.println(m+" "+n);//if we print this in method then it is print 
    }    
    public static void main(String[] args) {
        int m=9;
        int n=5;
        Swap(m, n);
    }
}
