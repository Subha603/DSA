package prostatic;

public class Main1 {
    public static void main(String[] args) {
      //  PrivateKeyword obj=new PrivateKeyword();
       // obj.num ;  /*give error because num is private */
       PrivateKeyword obj= PrivateKeyword.getInstance();
       PrivateKeyword obj1= PrivateKeyword.getInstance();
       PrivateKeyword obj2= PrivateKeyword.getInstance();
      
       /*all three reference variable pointing same object  */
    }
}
