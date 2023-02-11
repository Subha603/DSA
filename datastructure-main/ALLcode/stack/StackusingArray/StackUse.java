public class StackUse {
    public static void main(String[] args) throws StackfullException, StackEmptyException {
        StackusingArray stack=new StackusingArray();
        int arr[]={5,6,7,1,9};
        for( int i=0;i<arr.length;i++)
        {
            stack.push(arr[i]);
        }
        while(! stack.isEmpty())
        {
            System.out.println(stack.pop());
        }
        stack.push(12);
       System.out.println(stack.top());
        stack.pop();
        stack.Size();
        System.out.println(stack.isEmpty());    
        stack.pop(); 

    }
}
