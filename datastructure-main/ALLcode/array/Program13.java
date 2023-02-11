import java.util.ArrayList;
import java.util.Scanner;

public class Program13 
{
    //How to take 2D arraylist and print it 
 public static void main(String[] args) 

 {
    Scanner s=new Scanner(System.in);
    ArrayList<ArrayList<Integer>>list=new ArrayList<>();
    //intialisation
    for(int i=0;i<4;i++)
    {
        list.add(new ArrayList<>());
    }
    //add elements 
    for(int i=0;i<3;i++)
    {
        for(int j=0;j<3;j++)
        {
             list.get(i).add(s.nextInt());
        }
    }
    System.out.println(list);
    s.close();
 }   
}
