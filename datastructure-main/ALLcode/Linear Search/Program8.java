public class Program8 {
    //calculat the how many digits in number in the array
    public static void main(String[] args) {
        System.out.println(digits2(-56464346));
    } 
    static int digits2(int num)
    {   
        if(num<0)
        num=num*(-1);
        return (int)(Math.log10(num))+1;
    }
}
