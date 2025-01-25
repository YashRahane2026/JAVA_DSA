package _15_Queues;

public class CQ_LL {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class CQL{
        Node head = null;
        Node tail = null;
        int size = 0;
        public void add(int val){
            Node temp = new Node(val);
            if(size==0){
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
                tail.next = head;
            }
            size++;
        }
        public int remove() throws Error{
            if(size==0) throw new Error("Q is Empty");
            int x = head.val;
            head = head.next;
            tail.next = head;
            size--;
            return x;
        }
        public int peek() throws Error{
            if(size==0) throw new Error("Q is Empty");
            return head.val;
        }
        public void display() {
            if(size==0) {
                System.out.println("Q empty");
                return;
            }
            Node temp = head;
            for(int i=1;i<=size;i++){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        public boolean isEmpty(){
            if (size==0) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        CQL q = new CQL();
        q.display();
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        System.out.println(q.isEmpty());
        q.add(3);
        q.add(7);
        q.display();
        System.out.println(q.peek());
        q.remove();
        q.display();
    }
}
