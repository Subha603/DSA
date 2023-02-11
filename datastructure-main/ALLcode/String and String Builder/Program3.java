import java.util.ArrayList;

public class Program3
{
 public static void main(String[] args) 
 {
    System.out.println('a'+'b');  
    /*here it(char) will be print the Ascii   value because
    it convert char into the Integer  */
    System.out.println("a"+"b"); 
    /* here String will be concertinate each other*/
    System.out.println('a'+3);
    /*Ascii value of the char is a+3=100;
     * if i convert the 100 into the char then wwrite --
     */
    System.out.println((char)('a'+3));
    System.out.println("a"+1);
    /*String did not give any ascii value */
    /*Integer converted to integer that will call tostring() */
    /*This is same as after a few step "a"+"1" */
    System.out.println("kunal"+ new ArrayList<>());
    System.out.println("kunal"+ new Integer(56) );

  //  System.out.println(new Integer(value:56)+new ArrayList<>());
  /*this will give you error because when you  use primitives or complex object 
 after + then you must be use one String */
 /*The correct answer is */
 System.out.println(new Integer(56)+""+new ArrayList<>());
 /*The output also be a String  */
 /*In + position we cannot use - because operator - cannot be applied in the String 
 give  me error  */
}
}
