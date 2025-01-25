package _15_Queues;

public class LLImplementation {
    public static class Node{
        int val;
        Node next;
        Node(int val){
            this.val = val;
        }
    }
    public static class QueueLL{
        Node head = null;
        Node tail = null;
        int size = 0;
        public void add(int x){
            Node temp = new Node(x);
            if(size==0){
                head = tail = temp;
            } else {
                tail.next = temp;
                tail = temp;
            }
            size++;
        }
        public int remove(){
            if(size==0){
                System.out.println("Queue is Empty");
                return -1;
            }
            int x = head.val;
            head = head.next;
            size--;
            return x;
        }
        public int peek(){
            if(size==0){
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.val;
        }
        public void display(){
            if(size==0){
                System.out.println("Queue is Empty");
                return;
            }
            Node temp = head;
            while (temp!=null){
                System.out.print(temp.val+" ");
                temp = temp.next;
            }
            System.out.println();
        }
        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        QueueLL q = new QueueLL();
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
