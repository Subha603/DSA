import java.util.Scanner;

public class A 
{
public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    int i=s.nextInt();
    int j=s.nextInt();
    int arr[]={10,20,30,40,34,54,23};
    
    int temp=arr[i];
    arr[i]=arr[j];
    arr[j]=temp;
    System.out.println(arr[i]+""+arr[j]);
    
}


}
