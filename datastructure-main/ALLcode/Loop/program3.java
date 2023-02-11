import java.util.Scanner;



public class program3
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the three number");
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        // if(a>b && a>c)
        // {
        //     System.out.println("The large number is "+a);
        // }   
        // else if(b>c)
        // {
        //     System.out.println("The Large Number is "+b);
        // }
        // else
        // {
        //     System.out.println("The Large Number is "+c);
        // }
        // s.close();

                 

                     //another type //
        // int max=a;
        // if(max<b)
        // {
        //     max=b;
        // }
        // if(max<c)
        // {
        //     max=c;
        // }
        // System.out.println("The Large NUmber is "+max);


                              //another type 


            // int max=0;
            // if(a>b)
            // {
            //     max=a;
            // }         
            // else
            // {
            //     max=b;
            // } 
            // if(c>max)
            // {
            //     max=c;
            // }  
            // System.out.println("The maximum number is"+max);   
            
            
                                    //another Type //


             int max=Math.max(c,Math.max(a,b));//math.max method use to return the largest of the zero or more number 
             System.out.println("The Large number is "+max);
             s.close();

    

        }
    }    

