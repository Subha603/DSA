import java.util.ArrayList;

public class Program3
{
    /*Find all index linear search (ArrayLIst)using recursion  */
    public static void main(String[] args)
    {
      int [] arr={3,4,4,5,6,7,2};
      ArrayList<Integer>list=new ArrayList<Integer>();
     System.out.println(FindAllIndex(arr, 4, 0, list));
     /*print this way or below this way */
       System.out.println(FindAllIndex(arr, 4, 0,new ArrayList<>()));
       System.out.println(FindAllindex2(arr, 4, 0));
    }
    static ArrayList<Integer>FindAllIndex(int[]arr,int target,int index,ArrayList<Integer>list)
    {
        if(index==arr.length)
        {
            return list;
        }
        if(arr[index]==target)
        {
            list.add(index);
        }
        return FindAllIndex(arr, target, index+1, list);
    }  
    static ArrayList<Integer>FindAllindex2(int[]arr,int target,int index)
    {
        ArrayList<Integer>list=new ArrayList<>();
        if(index==arr.length)
        {
            return list;
        }
        //this will contain answer for that function call only
        if(arr[index]==target)
        {
            list.add(index);

        }
        ArrayList<Integer>ansfromBelowcalls= FindAllindex2(arr, target, index+1);
        list.addAll(ansfromBelowcalls);
        return  list;
    }

}
