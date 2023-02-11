public class program17 
{
    /*blocking scoping in string */
  public static void main(String[] args) {
    String name="kunal";
    System.out.println(name);
    {
        name ="Rahul";//here we update the value 
        //anything you can initilize in outside you cannot acess in inside 
        //anything you  can intilize in inside you cannot acces outside
        System.out.println(name);/*we can access in the block scoping the name of rahul  */
    }
    System.out.println(name);//here also we can acces it 
  }  
}
