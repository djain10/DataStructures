package dataStructures;

public class QueueUsingStack {
	
	
	
	Stack stack = new Stack();
	
	public void enqueue(int data){
		stack.push(data);
	}

	public void dequeue(int data){
		reverse(stack);
	}
	
	public void reverse(Stack stack){
		int temp = stack.pop();
		if(stack.isEmpty()){
			return;
		}
		reverse(stack);
		stack.push(temp);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
