class Node {
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
class SLL{
    private Node head;
    private Node tail;
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
        if(head==null) {
            head = tail = temp;
            return;
        }
        tail.next = temp;
        tail = temp;
        size++;
    }
    void insertAtHead(int val){
        Node temp = new Node(val);
        if(head==null){
            head = tail = temp;
            return;
        }
        temp.next = head;
        head = temp;
    }
    void insert(int idx,int val) throws Error{
        if(idx>=size || size<0) throw new Error("Invalid Index Bhai");
        if(idx==0) {
            insertAtHead(val);
            return;
        }
        if(idx==size-1) {
            insertAtEnd(val);
            return;
        }
        Node temp = new Node(val);
        Node x = head;
        for(int i=1;i<=idx-1;i++){
            x = x.next;
        }
        temp.next = x.next;
        x.next = temp;
        size++;
    }
    int get(int idx) throws Error{
        if(idx==size-1) return tail.val;
        if(idx>=size || idx<0){
            throw new Error("Invalid Index Bhai..");
        }
        Node temp = head;
        for(int i=1;i<=idx;i++){
            temp = temp.next;
        }
        return temp.val;
    }
    void set(int idx,int val) throws Error{
        if(idx>=size || idx<0){
            throw new Error("Invalid Index Bhai..");
        }
        if(idx==size-1) tail.val = val;
        Node temp = head;
        for(int i=1;i<=idx;i++){
            temp = temp.next;
        }
        temp.val = val;
    }
    void deleteAtHead(int idx) throws Error {
        if (head==null) throw new Error("Invalid Index Bhai..");
        head = head.next;
        size--;
    }
    void delete(int idx) throws Error{
        if(idx>=size || idx<0){
            throw new Error("Invalid Index Bhai..");
        }
        if(idx==0) {
            deleteAtHead(idx);
            return;
        }
        Node temp = head;
        for(int i=1;i<=idx-1;i++){
            temp = temp.next;
        }
        if(temp.next==tail) tail = temp;
        temp.next = temp.next.next;
        size--;
    }
}
class Main{
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtEnd(10);
        list.insertAtEnd(10);
        list.insertAtEnd(10);
        list.insertAtEnd(10);
        list.insertAtHead(22);
        list.insert(2,33);
        list.set(2,100);
        list.delete(2);
        list.delete(0);
        list.display();
        System.out.println(list.get(2));
    }
}