package _13_LinkedList;

public class ShallowCopyOfNode {
    public static void main(String[] args) {
        Node a = new Node(100);
        System.out.println(a.val);
        Node temp = a; // Shallow Copy
        //Node temp = new Node(100); //Deep Copy
        System.out.println(a);
        System.out.println(temp);
    }
}
