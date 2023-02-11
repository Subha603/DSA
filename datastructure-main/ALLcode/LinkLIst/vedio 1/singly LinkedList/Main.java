public class Main 
{
    public static void main(String[] args) {
        LinkedList list=new LinkedList();
        list.insertFirst(3);
        list.insertFirst(6);
        list.insertFirst(8);
        list.insertFirst(4);
        list.Display();
        System.out.println(list.size);
        System.out.println(list.DeleteFirst());
        list.lastinsert(99);
        list.insert(56, 2);
        list.Display();
       System.out.println(list.deleteLast());
       list.Display();
       System.out.println(list.delet(2));
       list.Display();
       System.out.println(list.size);
       System.out.println(list.find(8));
       list.Display();
       /*Circular LinkedList */
    //    CCL abc=new CCL();
    //    abc.insert(56);
    //    list.Display();

    }

    
    }
    

