package dataStructures;

public class Queue {

	public static class Node{
		private Node next;
		private int data;

		private Node(int data){
			this.data = data;
		}
	}

	private Node end;
	private Node head;

	public void add(int data){
		Node node = new Node(data);
		if(end!=null){
			end.next = node;
		}
		end = node;
		if(head == null){
			head = node;
		}

	}

	public int remove(){
		int data = head.data;
		head = head.next;
		if(head == null){
			end = head;
		}
		return data;
	}

	public void print(){
		if(head==null){
			System.out.println("null");
		}
		Node current = head;
		while(current!=null){			
			System.out.println(current.data);
			current = current.next;		
		}

	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue q = new Queue();
		q.print();
		q.add(2);
		q.add(3);
		q.add(13);
		q.add(12);
		q.print();
		q.remove();
		q.print();

	}

}
