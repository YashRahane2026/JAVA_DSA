package _13_LinkedList.DLL;

class DLL{
    dNode head;
    dNode tail;
    int size;
    void display(){
        dNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    void insertAtTail(int val){
        dNode temp = new dNode(val);
        if(size==0) {
            head = tail = temp;
            size++;
            return;
        }
        temp.prev = tail;
        tail.next = temp;
        tail = temp;
        size++;
    }
    void insertAtHead(int val){
        dNode temp = new dNode(val);
        if(size==0) {
            head = tail = temp;
            size++;
            return;
        }
        temp.prev = temp;
        temp.next = head;
        head = temp;
    }
    void insert(int idx,int val) throws Error{
        if(idx<0 || idx>size) throw new Error("Index error bhai..");
        if(idx==0) {
            insertAtHead(val);
            return;
        }
        if(idx==size) {
            insertAtTail(val);
            return;
        }
        dNode temp = new dNode(val);
        dNode t1 = head;
        for(int i=1;i<idx;i++){
            t1 = t1.next;
        }
        dNode t2 = t1.next;
        t1.next = temp;
        temp.prev = t1;
        temp.next = t2;
        t2.prev = temp;
        size++;
    }
    void deleteAtHead()throws Error {
        if(head==null) throw new Error("DLL is Empty");
        head =  head.next;
        head.prev = null;
        size--;
    }
    void deleteAtTail() throws Error{
        if(head==null) throw new Error("DLL is Empty");
        tail = tail.prev;
        tail.next = null;
        size--;
    }
    void delete(int idx) throws Error{
        if(idx<0 || idx>size) throw new Error("Index error bhai..");
        if(idx==0) {
            deleteAtHead();
            return;
        }
        if(idx==size) {
            deleteAtTail();
            return;
        }
        dNode temp = head;
        for(int i=1;i<idx;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
        if(temp.next!=null)temp.next.prev = temp;
        size--;
    }
}
public class Implementation_DLL {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertAtTail(10);
        list.insertAtTail(10);
        list.insertAtTail(10);
        list.insertAtTail(10);
        list.insertAtTail(10);
        list.insertAtHead(22);
        list.insert(2,44);
        list.delete(0);
        list.display();
    }
}
