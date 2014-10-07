
import java.util.*;
import java.util.Hashtable;
public class Stack<Anytype> {

    Node<Anytype> top;

    public Stack() { 
        this.top = null;
    }


    public void push(Anytype data){
        this.top = new Node<Anytype>(data,top);
    }

    public Anytype pop(){

        if (isEmpty()) { return null ; } 
        Anytype returnData = this.top.data;
        this.top = top.next;
        return returnData;
    }
        
    public Node peek(){
        return this.top;
        }
    public boolean isEmpty(){
        if(this.top == null) { return true;}
        return false;
        
    };
    public void print(){};

    public static void main(String[] args)
    { 
        Stack<String> stack = new Stack<String>();
        stack.push("Hello");
        stack.push("Kevin");
        System.out.println(stack.pop());
        System.out.println(stack.peek().data);

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
