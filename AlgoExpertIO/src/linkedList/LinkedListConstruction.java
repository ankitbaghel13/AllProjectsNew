package linkedList;

@SuppressWarnings("unused")
public class LinkedListConstruction {
	
	static class Node{
		int value;
		Node next;
		Node prev;
		
		Node(int value){
			this.value = value;
			next = null;
		}
	}
	
	static Node head;

	public static void main(String[] args) {

		//fillNormalData();
		//fillCycleData();
		//printList();
		//detectCyle();
		//detectAndRemoveLoop();
		//findMiddle();
		//insertAtHead(5);
		//insertAfter(head.next, 5);
		//insertAtTail(5);
		//deleteNode(1);
		//reverse();
		//merge();
		mergeInPlace();
		
	}
	
	private static void mergeInPlace() {
		Node L1head = new Node(1);
		L1head.next = new Node(3);
		L1head.next.next = new Node(4);
		L1head.next.next.next = new Node(5);
		L1head.next.next.next.next = new Node(9);
		L1head.next.next.next.next.next = new Node(10);
		
		Node L2head = new Node(2);
		L2head.next = new Node(6);
		L2head.next.next = new Node(7);
		L2head.next.next.next = new Node(8);
		printList(L1head);	
		printList(L2head);
		
		Node head = null;
		if(L1head.value<L2head.value) 
			head = mergeUtil(L1head,L2head);
		else
			head = mergeUtil(L2head,L1head);
		
		printList(head);
	}
	
	
	private static Node mergeUtil(Node h1, Node h2) {
		
		if(h1.next==null) {
			h1.next = h2;
			return h1;
		}
		
		Node curr1 = h1;
		Node next1 = h1.next;
		Node curr2 = h2;
		Node next2 = h2.next;
		
		while(next1 != null && curr2 != null) {
			if((curr2.value >= curr1.value) && 
					(curr2.value <= next1.value)) {
				next2 = curr2.next;
				curr1.next = curr2;
				curr2.next = next1;
				
				curr1 = curr2;
				curr2 = next2;
			}else {
				if(next1.next != null) {
					curr1 = curr1.next;
					next1 = next1.next;
				}else {
					next1.next = curr2;
					return h1;
				}
			}
		}
		return h1;
	}

	private static void merge() {
		
		Node L1head = new Node(1);
		L1head.next = new Node(3);
		L1head.next.next = new Node(4);
		L1head.next.next.next = new Node(5);
		L1head.next.next.next.next = new Node(9);
		L1head.next.next.next.next.next = new Node(10);
		
		Node L2head = new Node(2);
		L2head.next = new Node(6);
		L2head.next.next = new Node(7);
		L2head.next.next.next = new Node(8);
		printList(L1head);	
		printList(L2head);
		Node prev1 = null;
		//Node prev2 = null;
		Node head1 = L1head;
		Node head2 = L2head;
		Node node;
		while(head1 != null && head2!=null) {
			
			if(head1.value < head2.value) {
				prev1 = head1;
				head1 = head1.next;
			}else {
				node = new Node(head2.value);
				node.next = prev1.next;
				prev1.next = node;
				prev1 = node;
				//prev2 = head2;
				head2 = head2.next;
			}
		}
		printList(L1head);
	}

	private static void reverse() {
	
		Node prev = null;
		Node curr = head;
		Node next = null;
		
		while(curr!=null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		printList(prev);
	}

	private static void deleteNode(int data) {
		
		Node current = head;
		Node prev = null;
		
		// If head node itself holds the key to be deleted
		if(head!=null && head.value==data) {
			head = head.next;
			printList();
			return;
		}
		while(current.value != data && current!=null) {
			prev = current;
			current = current.next;
		}
		
		if(current==null)
			return;
		prev.next = current.next;
		printList();
	}

	private static void insertAtTail(int newData) {
		
		Node last = head;
		Node newNode = new Node(newData);
		while(last.next!=null) 
			last = last.next;
		
		last.next = newNode;
		printList();
	}

	private static void insertAtHead(int newData) {
		Node newNode = new Node(newData);
		newNode.next = head;
		head = newNode;
		printList();
	}

	private static void insertAfter(Node prevNode, int newData) {
		
		if(prevNode == null) {
			System.out.println("Previos node can not be null");
			return;
		}
		
		Node newNode = new Node(newData);
		newNode.next = prevNode.next;
		prevNode.next = newNode;
		printList();
	}

	private static void detectAndRemoveLoop() {
		
		Node fastPtr = head;
		Node slowPtr = head;
		boolean cycleDetected = false;
		
		while(fastPtr!=null && fastPtr.next!=null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			
			if(slowPtr == fastPtr) {
				cycleDetected=true;
				break;
			}
		}
		
		if(cycleDetected) {
			slowPtr = head;
			while(slowPtr.next != fastPtr.next) {
				fastPtr = fastPtr.next;
				slowPtr = slowPtr.next;
			}
			System.out.println("\nCycle detected at "+fastPtr.next.value);
			fastPtr.next = null;
			System.out.println("Cycle removed");	
			printList();
			
		}else {
			System.out.println("\nNo cycle detected");
		}
	}

	private static void detectCyle() {
		
		Node fastPtr = head;
		Node slowPtr = head;
		
		while(fastPtr!=null && fastPtr.next!=null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
			
			if(slowPtr == fastPtr) {
				System.out.println("\nCycle detected");
				return;
			}
		}
		System.out.println("\nNo cyle detected");
	}

	private static void findMiddle() {
		
		Node fastPtr = head;
		Node slowPtr = head;
		
		while(fastPtr!=null && fastPtr.next!=null) {
			fastPtr = fastPtr.next.next;
			slowPtr = slowPtr.next;
		}
		
		System.out.println("\nMiddle element is "+slowPtr.value);
	}

	private static void fillData() {

		//normalData();
	}

	private static void fillNormalData() {
		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
	}
	
	private static void fillCycleData() {
		//1-2-3-4-5-6-7
		//	   	  5-9-8
		head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		Node next1 = new Node(4);
		head.next.next.next = next1;
		next1.next = new Node(5);
		next1.next.next = new Node(6);
		Node next2 = new Node(7);
		next1.next.next.next = next2;
		next2.next = new Node(8);
		next2.next.next = new Node(9);
		next2.next.next.next = next1.next;
	}

	private static void printList() {
		
		Node current = head;
		int i=0;
		while(current != null && i<20) {
			System.out.print(current.value+" ");
			current = current.next;
			i++;
		}
		System.out.println();
	}
	
	private static void printList(Node head) {

		Node current = head;
		int i=0;
		while(current != null && i<20) {
			System.out.print(current.value+" ");
			current = current.next;
			i++;
		}
		System.out.println();
	}

}
