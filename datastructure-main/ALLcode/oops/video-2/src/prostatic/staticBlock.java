package prostatic;
/*---------This is a demo of show static variable -----------*/
public  class staticBlock {

    static int  a=4;
    static int b;/*In the Static you can put some default value */
    /*static Block will only run once,when the first obj is created 
     * when the class is loaaded for the first time
     */
    static{
        System.out.println("I am in static block");
        b=a*5;
    }
    public static void main(String[] args) {
        staticBlock obj=new staticBlock();
        System.out.println(staticBlock.a+" "+staticBlock.b);
        staticBlock.b+=3;
        System.out.println(staticBlock.a+" "+staticBlock.b);
        staticBlock obj1=new staticBlock();
        System.out.println(staticBlock.a+" "+staticBlock.b);
    }
}
