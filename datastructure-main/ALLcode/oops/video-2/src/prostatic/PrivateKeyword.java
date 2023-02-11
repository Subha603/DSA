package prostatic;

public class PrivateKeyword {
    /*This file connect to the main1.java  */
    
//private int num=0;
private PrivateKeyword()
{
    /*if you make private you cannot access it another class
     * so atfirst you creat private privateKeyword instance
     */
}
private static PrivateKeyword instance;

public static PrivateKeyword getInstance()
{
    /*chack Wheather one object will created or not  */
    if(instance==null)
    {
        instance=new PrivateKeyword();//creat the object
    }
    return instance;
    
}

 
}
 

