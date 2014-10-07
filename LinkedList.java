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
    class Node { 
        Node next;
        int data;

        Node(int d) {
            this.next = null;
            this.data = d;
        }
    }

    LinkedList() { 
        this.firstNode = null;
    }

    public void add(int s) { 
        Node nodeToAdd = new Node(s);
        Node nodeIterator = this.firstNode;
        if(nodeIterator == null) { 
            this.firstNode = nodeToAdd;
            return ;
        }
        while(nodeIterator.next != null) { 
            nodeIterator = nodeIterator.next;
        }
        nodeIterator.next = nodeToAdd;
    }
    public void delete(int d) { 
        if(this.firstNode == null) { 
            return;
        }
        if(this.firstNode.data == d) { 
            this.firstNode = firstNode.next;
            System.out.println("Removing Node " + d);
            return;
        }
        Node prev,cur; 
        cur = firstNode;
        prev = null;

        while( cur != null && cur.data != d ) { 
            prev = cur;
            cur = cur.next;
        }
        System.out.println("Removing Node " + d);
        prev.next = cur.next ;
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

