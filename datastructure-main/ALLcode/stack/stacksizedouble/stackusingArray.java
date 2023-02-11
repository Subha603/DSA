
public class stackusingArray {
    private int  data[];
    private int topIndex;
    public stackusingArray()
    {
        data=new int[2];
        topIndex =-1;
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
            // StackfullException e=new StackfullException();
            // throw e;
            /*simple way you can write it */
            
            //throw new stackfullExpception(); 
                
        /*Throw and Exception*/ 
        doublecapacity();

        }   
       topIndex++;
       data[topIndex]=element;
    }
    
    private void doublecapacity() {
        System.out.println("Double Capacity");
        int temp[]=data;
        data=new int[2*temp.length];
        for(int i=1;i<temp.length;i++)
    {
        data[i]=temp[i];
    }
    }
    public int top() throws stackEmptyException
    {
      
       if(topIndex==-1)
       {
       /*Throw stackEmptyException */
       throw  new stackEmptyException();
       }
       return data[topIndex];
         
        
    }
    public int pop() throws stackEmptyException
    {
        if(topIndex==-1)
       {
       /*Throw stackEmptyException */
       throw  new stackEmptyException();
       }
       int temp=data[topIndex];
       topIndex--;
       return temp;
        
    }

}
