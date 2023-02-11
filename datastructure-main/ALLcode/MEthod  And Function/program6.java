public class program6 
{
    public static void main(String[] args) {
        // according program4 if you do not want to use (Scanner.in=new Scanner)again and again and take input 
        //how will you  Take input?
        
        //pass the value of number when you are calling the method in main()
        //at first take two parameters
         int ans=sum3(20,30);//in this line we call the method and enter the paremeter
         System.out.println(ans);
    } 
    static int sum3(int a,int b)
    {
        int sum=a+b;
        return sum;
        
    } 

}
