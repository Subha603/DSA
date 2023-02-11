import java.util.Arrays;
import java.util.Scanner;

public class Program5 
{
public static void main(String[] args) 
{
  Scanner s=new Scanner(System.in);
  String[]str=new String[4];
  for(int i=0;i<str.length;i++)
  {
    str[i]=s.nextLine();
  }   
  System.out.println(Arrays.toString(str));
  str[1]="Subhajit";//replace the String in array
  System.out.println(Arrays.toString(str));
}    
}
