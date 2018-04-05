package dataStructures;


public class Stack {

	private static class Node{
		Node next;
		int data;

		private Node(int data){
			this.data = data;
		}
	}

	private Node top;
	private void push(int data){
		Node n = new Node(data);
		if(top == null){
			top = n;
		}
		else{
		n.next = top;
		 top =n;
		}
	}

	private void pop(){
		
		top = top.next;
	}

	public void print(){
		if(top==null){
			System.out.println("null");
		}
		Node current = top;
		while(current != null){
			System.out.println(current.data);
			current = current.next;
		}
	}
	public static void main(String[] args) {

		Stack s = new Stack();
		s.print();
		s.push(2);
		s.push(3);
		s.push(13);
		s.push(12);
		s.pop();
		s.print();
	}
}
