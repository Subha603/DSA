
public class LinkedList {
    
    private node head;
    private node tail;
    int size;
   
    LinkedList()
    {
        this.size=0;
        
    }
    /*--------------------------------------------when you want to insert first----------------------------------- */
    public void insertFirst(int val)
    {
        node node=new node(val);
        node.next=head;
        head=node;
        if(tail==null)
        {
            
            tail=head;
            
        }
        size++;
    }
    /*---------------------------------------------when you want to insert at last-------------------------------------  */
    public void lastinsert(int val)
    {
        if(tail==null)
        {
            insertFirst(val);
            return;
        }
        node node=new node(val);
        tail.next=node;
        tail=node;
        
        size++;
    }
    public void insert(int val,int index)
    {
        if(index==0)
        {
            insertFirst(val);
            return;
        }
        if(index==size){
            lastinsert(val);
            return ;
        }
        node temp=head;
        for(int i=1;i<index;i++){
            temp=temp.next;
        }
        node node=new node(val,temp.next);
        temp.next=node;
        size++;
    }
    /*-----------------------------------------Delet the first element ------------------------------------------------*/
       public int DeleteFirst()
       {
        int value=head.value;
       head=head.next;
        if(head==null)
        {
            tail=null;
        }
        size--;
        return value;

        
    }
    /*    -------------------------------delete the last element ----------------------------------------------------- */
       public int deleteLast()
       {
        if(size<=1)
        {
           return DeleteFirst(); 
        }
        node secondLast=get(size-2);
        int value=tail.value;
        tail=secondLast;
        tail.next=null;
        size--;
        return value;
       }
       /*-----------------------------------------if you want to delet any index----------------------------------------------- */
       public int delet(int index)
       {
            if(index==0)
            {
                return DeleteFirst();
            }
            if(index==size)
            {
                return deleteLast();
            }
            node prv=get(index-1);
            int val=prv.next.value;
            prv.next=prv.next.next;
            size--;
            return val;
        
       }
       /*-----------------this get help to find the index where we want to delete  ------------------------------------- */
       public node get(int index)
       {
        node node=head;
            for(int i=0;i<index;i++)
            {
                node=node.next;
            }
            return node;
       }

    /*------------------------------------------------how to find the element---------------------------------------------- */
        public node find(int value)
        {
            node node=head;
            while(node!=null)
            {
                if(node.value==value)
                {
                    return node;
                }
                node=node.next;
            }
            return null;
        }
    
    
    /*---------------------------when you insert at first in LinkList you do this for display------------------------------------- */

    public void Display()
    {
        node temp=head;
        while(temp!=null)
      {
        System.out.print(temp.value+" ");
       
        temp=temp.next;
      }
      System.out.println("End");
    }
  
}





class node 
{
    int value;
     node next;

    public node(int value) {
        this.value = value;
    }
    public node(int value, node next) {
        this.value = value;
        this.next = next;
    } 
       
}
