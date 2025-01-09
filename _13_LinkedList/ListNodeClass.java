package _13_LinkedList;
class Node{
    int val;
    Node next;
    Node(int val){
        this.val = val;
    }
}
public class ListNodeClass {
    static void print(Node head){
        Node temp = head;
        while (temp!=null){
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
    static void printRecursively(Node head){
        if(head==null) return;
        System.out.println(head.val);
        printRecursively(head.next);
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

        printRecursively(a);

//        System.out.println(a.val);
//        System.out.println(a.next.val);
//        System.out.println(a.next.next.val);
//        System.out.println(a.next.next.next.val);
//        System.out.println(a.next.next.next.next.val);
    }
}
