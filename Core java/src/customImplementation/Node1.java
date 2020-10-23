package customImplementation;

public class Node1 {

	public String bookName;
	public int noSold;

	public Node1 next;

	public Node1(String bookName, int noSold) {

		this.bookName = bookName;
		this.noSold = noSold;
	}

	@Override
	public String toString() {

		return bookName;
	}

	public void display() {

		System.out.print(bookName + " --> ");
	}

	public static void main(String[] args) {
		
		LinkedList linkedList = new LinkedList();
		
		linkedList.insertFirstLink("bookName1", 1);
		linkedList.insertFirstLink("The Lord of the Rings", 2);
		linkedList.insertFirstLink("bookName3", 3);
		linkedList.insertFirstLink("bookName4", 4);
		linkedList.insertFirstLink("bookName5", 5);
		linkedList.display();
		
		linkedList.removeFirstLink();
		linkedList.display();
		
		System.out.println(linkedList.find("The Lord of the Rings")+" was found");
		
		linkedList.removeLink("bookName3");
		linkedList.display();
		
		linkedList.insertLink(2, "The Matriz", 7);
		linkedList.display();
		
	}
}

class LinkedList {

	public Node1 firstLink;

	public LinkedList() {

		firstLink = null;
	}

	public boolean isEmpty() {

		return (firstLink == null);
	}

	public void insertFirstLink(String bookName, int noSold) {

		Node1 newNode1 = new Node1(bookName, noSold);

		newNode1.next = firstLink;
		firstLink = newNode1;
	}
	
	public void insertLink(int position, String bookName, int noSold){
		
		Node1 newNode1 = new Node1(bookName, noSold);
		Node1 previous = firstLink;
		
		int count = 1;
		
		while(count<position-1){
			previous = previous.next;
			count++;
		}
		
		Node1 current = previous.next;
		newNode1.next = current;
		previous.next = newNode1;
	}

	public Node1 removeFirstLink() {

		Node1 linkReference = firstLink;

		if (!isEmpty())
			firstLink = firstLink.next;
		else
			System.out.println("Empty linked list");

		return linkReference;
	}
	
	public Node1 reverse(Node1 Node1) {
        Node1 prev = null;
        Node1 current = Node1;
        Node1 nextNode1 = null;
        while (current != null) {
        	nextNode1 = current.next;	//temp Node1 nextNode1
            current.next = prev;		//swapping 
            prev = current;
            current = nextNode1;
        }
        Node1 = prev;
        return Node1;
    }

	public void display() {

		Node1 theLink = firstLink;

		while (theLink != null) {

			theLink.display();
			//System.out.println("Next Link : " + theLink.next);
			theLink = theLink.next;
			
			//System.out.println();
		}
		System.out.print(theLink);
		System.out.println();
	}

	public Node1 find(String bookName) {

		Node1 theLink = firstLink;

		if (!isEmpty()) {
			while (theLink.bookName != bookName) {
				if (theLink.next == null)
					return null;
				else
					theLink = theLink.next;
			}
		} else
			System.out.println("Empty Linked List");

		return theLink;
	}

	public Node1 removeLink(String bookName){
		
		Node1 currentLink = firstLink;
		Node1 previousLink = firstLink;
		
		if(!isEmpty()){
			while(currentLink.bookName!=bookName){
				if(currentLink.next==null){
					//System.out.println("Node1 didn't found");
					return null;
				}
				else{
					previousLink = currentLink;
					currentLink = currentLink.next;
				}
			}
			
			if(currentLink == firstLink)
				firstLink = firstLink.next;
			else
				previousLink.next = currentLink.next;
			
			return currentLink;
		}
		else
			System.out.println("Empty Linked List");
		return null;
		
	}
}