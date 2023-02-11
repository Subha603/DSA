
import java.util.ArrayList;
import java.util.Scanner;

/*How  take input 1D arraylist and print it */
public class Program12 {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        ArrayList<Integer>list=new ArrayList<>(5);
        // list.add(45);
        // list.add(678);
        // list.add(35);
        // list.add(5678);
        // System.out.println(list.contains(678));
        // System.out.println(list.contains(46758));
        // System.out.println(list);
        // list.remove(45);
        // list.set(0, 99);
        /*Input */
        for(int i=0;i<5;i++)
        {
            list.add(s.nextInt());
        }
       /* Get the item at any index*/
       for(int i=0;i<5;i++)
       {
        System.out.print(list.get(i)+" ");
       } 
     //  System.out.println(list);
    s.close();
    }
}
