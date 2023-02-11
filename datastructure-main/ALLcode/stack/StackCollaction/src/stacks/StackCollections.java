package stacks;

import java.util.Stack;



public class StackCollections {
	public static void main(String[]args)
	{
		Stack<Integer>stack=new Stack<>();
		/*use for inserting the element in stack*/
		stack.push(10); /*first-input->10,20,30,so last  element in stack is 30*/
		stack.push(20);
		stack.push(30);
		/*use for finding the size of the stack*/
		stack.size();
		System.out.println("stack size is--"+stack.size());
		/*use for finding the top most element  of the stack*/
		System.out.println("Top most element of the stack--"+stack.peek());
		/*-----use for deleting the element---------*/
		//stack.pop(); 
		System.out.println("Deleting the element of the stack--"+stack.pop());
		System.out.println("TOp most element of the stack--"+stack.pop());
		System.out.println("Stack is Empty--"+stack.isEmpty());
		int arr[]= {5,6,7,1,9};
		for(int elem : arr)
		{
			stack.push(elem);
		}
		while(!stack.isEmpty())
		{
			System.out.println(stack.pop());
		}
	}

}
