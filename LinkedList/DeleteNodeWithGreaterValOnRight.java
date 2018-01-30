// Java program to delete nodes which have a greater value on 
// right side
class LinkedList
{
	Node head; // head of list

	/* Linked list Node*/
	class Node
	{
		int data;
		Node next;
		Node(int d) { data = d; next = null; }
	}




	Node  delLesserNode(Node head)
	{
	    if(head == null || head.next == null){
	        return head;
	    }
	    Node prev= null;
	    Node current = head;
	    Node next = head.next;
	    if(current.data < next.data){
	       next = delLesserNode(next);
	       return next ;
	    }else{
	        current.next=delLesserNode(next);
	        return current;
	    }
	    

	}

	/* Utility functions */

	/* Inserts a new Node at front of the list. */
	void push(int new_data)
	{
		/* 1 & 2: Allocate the Node &
				Put in the data*/
		Node new_node = new Node(new_data);

		/* 3. Make next of new Node as head */
		new_node.next = head;

		/* 4. Move the head to point to new Node */
		head = new_node;
	}



	/* Function to print linked list */
	void printList()
	{
		Node temp = head;
		while (temp != null)
		{
			System.out.print(temp.data+" ");
			temp = temp.next;
		}
		System.out.println();
	}

	/* Drier program to test above functions */
	public static void main(String args[])
	{
		LinkedList llist = new LinkedList();

		/* Constructed Linked List is 12->15->10->11->
		5->6->2->3 */
		llist.push(3);
		llist.push(2);
		llist.push(6);
		llist.push(5);
		llist.push(11);
		llist.push(10);
		llist.push(15);
		llist.push(12);

		System.out.println("Given Linked List");
		llist.printList();

		llist.head = llist.delLesserNode(llist.head);

		System.out.println("Modified Linked List");
		llist.printList();
	}
} 
