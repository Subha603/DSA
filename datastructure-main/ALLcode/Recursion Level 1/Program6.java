public class Program6 
{
public static void main(String[] args) {
    fun(5);
}

static void fun(int n)
{
    if(n==0)
    {
        return;
    }
    System.out.println(n); 
  //  fun(n--);
  /*difference between n--  and --n */
  /*n-- pass the value first and then subtract */
  /*--n subtract first and then pass the value */
  fun(--n);
}
}
