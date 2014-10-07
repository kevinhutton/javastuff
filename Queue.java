
import java.util.*;
import java.util.Hashtable;
public class Queue<Anytype> {

    Node<Anytype> front;
    Node<Anytype> back;

    public Queue() { 
        this.front = null;
        this.back = null;
    }

    public void enqueue(Anytype data){

        Node<Anytype> newNode = new Node<Anytype>(data,null);
        if(front == null) { 
            front = newNode;
            back = front;
        }
        back.next = newNode;
        back = back.next;
    }
    public void dequeue(){

        if(isEmpty()) { return ; } 
        front = front.next;

    }
    public Node peek(){
        return this.front;
    }

    public boolean isEmpty(){
        if(this.front == null) { return true;}
        return false;
        
    };

    public void print(){
        Node<Anytype> it = front;
        while(it != null) { 
            System.out.println(it.data);
            it = it.next;
        }
    };

    public static void main(String[] args)
    { 
        Queue<String> newQ = new Queue<String>();
        newQ.enqueue("Kevin");
        newQ.enqueue("Hutton");
        newQ.dequeue();
        newQ.print();
    }

    public class Node<Anytype> { 
        Anytype data ;
        Node next;
        Node(Anytype data, Node next) { 
            this.data = data;
            this.next = next;
        }
    }
}
