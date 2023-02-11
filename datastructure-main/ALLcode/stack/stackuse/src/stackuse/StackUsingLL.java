package stackuse;
import stackuse.linkedlist.Node;
public class StackUsingLL<T> {
	private Node<T>head;
	private int size;
	public StackUsingLL()
	{
		head=null;
		size=0;
	}
	public int size()
	{
		return 0;
		
	}
	public boolean isEmpty()
	{
		return size==0;
		
		
	}
	 public void push(T elem)
	 {
		  Node<T>newNode=new Node<T>(elem);
		  newNode.next=head;
		  head=newNode;
		  size++;
	 }
	 public T top() throws stackEmptyException
	 {
		 if(head==null)
		 {
			 throw new stackEmptyException();
		 }
		  return head.data;
	 }
	 public  T pop() throws stackEmptyException
	 {
		 if(head==null)
		 {
			 throw new stackEmptyException();
		 }
		T temp=head.data;
		head=head.next;
		size--;
		return temp;
	 }

}
