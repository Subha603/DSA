import java.util.Arrays;
import java.util.Scanner;
/*How to print the 2D Array */
public class program7
{
    //2D array 
    /*
     * 1 2 3
     * 4 5 6
     * 7 8 9
     */
    /**
     * @param args
     */
    public static void main(String[] args) {
       
                //    int [][] Array=new int[3][3];//here number of rows is mendatory
                        //but number of cloumn are not mendatory 
                 int[][]  Array={
                       {1,2,3},//0 th index
                     {4,5,6},//1st index
                        {7,8,9}//2nd index if we write here arr2D[2]={6,7,8,9}
                        //if we write arr2D[2][0]then t print{6}
                          };
                          System.out.println(Arrays.deepToString(Array));
       
}
}

