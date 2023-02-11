package prostatic;

public class InnerClasses 
{
   static  class Test/*here we write static becase this is Test 
   class dependes on the Innerclasses */
   /*Inner class can be static but outer class not static  */
    {
        String Name;
        public Test(String name)/*this is constructor */
        {
            this.Name=name;
        }
    }
    // static class A{

    // }
public static void main(String[] args) {
   Test a=new Test("Kunal");/*give an Error for non static class
but we creat of the nonstatiic class(Test)object also give error 
becase it dependes on the outer class(InnerClass) */
}
    
}
