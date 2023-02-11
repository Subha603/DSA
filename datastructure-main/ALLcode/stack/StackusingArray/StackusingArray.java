public class StackusingArray
{
    private int data[];
    private int topIndex;
    public StackusingArray()
    {
        data=new int[10];
        topIndex=-1;  
        
    }
    public int Size()
    {
        return topIndex+1;
        
    }
    public boolean isEmpty()
    {
        if(topIndex==-1)
        {
            return true;
        }
        else
        {
        return false;
        }
         
        
    }
    public void push(int element) throws StackfullException
    {
        /*If stack is full  */
        if(topIndex==data.length-1 )
        {
            StackfullException e=new StackfullException();
            throw e;
            /*simple way you can write it */
            
            //throw new stackfullExpception(); 
                
        /*Throw and Exception*/ 

        }   
       topIndex++;
       data[topIndex]=element;
    }
    public int top() throws StackEmptyException
    {
      
       if(topIndex==-1)
       {
       /*Throw stackEmptyException */
       throw  new StackEmptyException();
       }
       return data[topIndex];
         
        
    }
    public int pop() throws StackEmptyException
    {
        if(topIndex==-1)
       {
       /*Throw stackEmptyException */
       throw  new StackEmptyException();
       }
       int temp=data[topIndex];
       topIndex--;
       return temp;
        
    }
}