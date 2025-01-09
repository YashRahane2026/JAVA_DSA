package _13_LinkedList;

public class FindTail {
    static int findTail(Node head){
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        return temp.val;
    }
    public static void main(String[] args) {
        Node a = new Node(10);// head
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        a.next = b; // 10->20
        b.next = c; // 10->20->30
        c.next = d; // 10->20->30->40
        d.next = e; // 10->20->30->40->50
        System.out.println(findTail(a));
    }
}
