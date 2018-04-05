package dataStructures;


public class LinkedList {
	Node head;
	public static void main(String[] args) {

		LinkedList l = new LinkedList();
		l.addNode(2);
		l.addNode(3);
		l.addNode(4);
		l.addNode(5);
		l.deleteWithValue(5);
		l.prepend(5);
		l.print();

	}

	public void addNode(int data){
		if(head == null){ 
			head = new Node(data);
			return;
		}
		Node current = head;
		while(current.next !=null){
			current = current.next;
		}
		current.next = new Node(data);
	}
	
	public void prepend(int data){
		Node newHead = new Node(data);
		newHead.next = head;
		head = newHead;
	}
	
	public void deleteWithValue(int data){
		if(head == null) return;
		if(head.data == data){
			  head = head.next;
			  return;
		}
		Node current = head;
		while(current.next!=null){
			if(current.next.data == data){
				current.next = current.next.next;
				return;
			}
			current = current.next;
		}
	}
	
	public void print(){
		if(head == null){
			System.out.println("null");
		}
		Node current = head;
		while(current !=null){
				System.out.println(current.data);
				current = current.next;			
		}
	}
}

