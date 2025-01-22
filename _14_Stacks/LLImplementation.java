package _14_Stacks;
class Node {
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class Stack{
    Node head = null;
    int size = 0;
    void push(int val){
        Node temp = new Node(val);
        temp.next = head;
        head = temp;
        size++;
    }
    int pop() throws Error{
        if(head==null) throw new Error("Stack is Empty");
        int n = head.val;
        head = head.next;
        size--;
        return n;
    }
    int peek() throws Error{
        if(head==null) throw new Error("Stack is Empty");
        return head.val;
    }
    void displayRec(Node head){
        if(head==null) return;
        Node temp = head;
        displayRec(temp.next);
        System.out.print(temp.val+"");
    }
    void display() throws Error{
        if(head==null) throw new Error("Stack is Empty");
        displayRec(head);
    }
}
public class LLImplementation {
    public static void main(String[] args) {
        ArrImplementation.Stack st = new ArrImplementation.Stack();
        st.push(1);
        st.push(0);
        st.push(-1);
        st.push(-2);
        st.push(-3);
        st.display();
        System.out.println(st.peek());
        st.pop();
        st.display();
    }
}
