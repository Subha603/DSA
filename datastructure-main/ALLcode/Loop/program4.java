
import java.util.Scanner;

//Type chack 
public class program4 
{


    

    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
    
    char ch=s.next().trim().charAt(0);
      //in.next basically means that print the next word ,if I can say hello it is print hello 
      //trim() basically means remove all the extra pesses that are end of the word
      //if I can say           hello 
      //it print hello  here extra pess are removed  
      //if we write k it is String input it is not char input to convert into char input 
      // CharAt(0) basically means give me the character of this index of the String
      
      
      //String word ="HEllo ";
     // System.out.println(word.charAt(0));//charAt is a method returns the character at aspcified index in String 
       
     if(ch>='a'&&ch<='Z')
      System.out.println("Lower case");
      System.out.println("Upper case");
    }
}
