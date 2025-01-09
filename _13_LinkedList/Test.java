package _13_LinkedList;

public class Test {
    public static int middleNode(Node head) {
        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.val;
    }
    Node a = new Node(10);
    Node b = new Node(22);
    Node c = new Node(33);
    
    public static void main(String[] args) {
        Node a = new Node(10);// head
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        //Node f = new Node(60);
        a.next = b; // 10->20
        b.next = c; // 10->20->30
        c.next = d; // 10->20->30->40
        d.next = e; // 10->20->30->40->50
        //e.next = f; // 10->20->30->40->50->60
        System.out.println(middleNode(a));
    }
}
