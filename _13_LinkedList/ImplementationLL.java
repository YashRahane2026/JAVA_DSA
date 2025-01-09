package _13_LinkedList;

class SLL{ // User Designed Data Structure
    Node head;
    Node tail;
    int size;
    void display(){
        Node temp = head;
        while (temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void insertAtEnd(int val){
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
        size++;
    }
    void insertAtStart(int val){
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else {
            temp.next = head;
            head = temp;
        }
        size++;
    }
    void insert(int idx,int val) throws Error{
        if(idx==0){
            insertAtStart(val);
            return;
        }
        if(idx==size){
            insertAtEnd(val);
            return;
        }
        if(idx>size || idx<0) throw new Error("Invalid Index");
        Node temp = new Node(val);
        Node x = head;
        for(int i=0;i<idx-1;i++) {
            x = x.next;
        }
        //Insertion
        temp.next = x.next;
        x.next = temp;
        size++;
    }
    int getElement(int idx) throws Error{
        if(idx==size-1) return tail.val;
        if(idx>=size) throw new Error("Bhai Error");
        Node x = head;
        for(int i=0;i<idx;i++) {
            x = x.next;
        }
        return x.val;
    }
    void set(int idx,int val) throws Error{
        if(idx==size-1) {
            tail.val = val;
            return;
        }
        if(idx>=size || size<0) throw new Error("Bhai Error");
        Node x = head;
        for(int i=0;i<idx;i++) {
            x = x.next;
        }
        x.val = val;
    }
    void deleteAtHead() throws Error{
        if(head==null) throw new Error("List is Empty");
        head = head.next;
        size--;
    }
    void delete(int idx) throws Error{
        if(head==null) throw new Error("List is Empty");
        if(idx>=size || size<0) throw new Error("Bhai Error");
        Node temp = head;
        for(int i=0;i<idx-1;i++) {
            temp = temp.next;
        }
        if(temp.next==tail) tail = temp;
        temp.next = temp.next.next;
        size--;
    }
}
public class ImplementationLL {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtEnd(50);
        list.insertAtEnd(22);
        list.insertAtEnd(33);
        list.insertAtEnd(44);
        list.insertAtStart(22);
        list.insertAtStart(99);
        list.insertAtStart(66);
        list.insert(3,10000);
        list.set(3,1101);
        list.deleteAtHead();
        list.delete(2);
        list.display();
        System.out.println(list.getElement(2));
    }
}
