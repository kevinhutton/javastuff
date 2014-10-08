import java.util.*;
import java.util.Hashtable;
public class LinkedList {

    public static void main(String[] args)
    { 

        LinkedList list = new LinkedList() ;
        list.add(2);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(1);
        list.printLinkedList();
        list.removeDuplicates();
        list.printLinkedList();
    }


    Node firstNode;
    Node lastNode;

    class Node { 
        Node next;
        Node previous;
        int data;

        Node(int d) {
            this.next = null;
            this.previous= null;
            this.data = d;
        }
    }

    LinkedList() { 
        this.firstNode = null;
        this.lastNode = null;
    }

    public void addFirst(int s) { 
        Node nodeToAdd = new Node(s);
        if (this.firstNode == null) { 
		firstNode = nodeToAdd;
		lastNode = nodeToAdd;
	}
	else { 
	   firstNode.prev = nodeToAdd;
	   nodeToAdd.next = firstNode;
	   firstNode = nodeToAdd;
	}
	

    }
    public void addLast(int s) { 
        Node nodeToAdd = new Node(s);
        if (this.lastNode == null) { 
		firstNode = nodeToAdd;
		lastNode = nodeToAdd;
	}

	else { 
	   lastNode.next = nodeToAdd;
	   nodeToAdd.prev = lastNode ;
	   lastNode = nodeToAdd;
	}
	

    }
    public void delete(int d) { 
        if(this.firstNode == null) { 
            return;
        }
	Node current = firstNode;
	while(current.data != d) { 
		current = current.next;
		if(current == null)
		    return null;             // didn't find it
	 }
	
        if(current == first) { 
            firstNode = firstNode.next;
            System.out.println("Removing Node " + d);
        }
	else { 
		current.previous.next = current.next;
	}
    }
            
            

    public void printLinkedList () { 
        Node nodeIterator = this.firstNode;
        while(nodeIterator != null) {
            System.out.println(" " + nodeIterator.data + " \n");
            nodeIterator = nodeIterator.next;
        }
    }
    public void removeDuplicates () { 
        Hashtable table = new Hashtable();
        Node current   = firstNode;
        Node previous = null;

        while(current != null) { 
            if (table.containsKey(current.data)) { 
                System.out.println("removing dup");
                previous.next = current.next ;
            }
            else { 
                table.put(current.data,true);
                previous = current;
            }
            current = current.next;
        }
        return ;

    }
}

