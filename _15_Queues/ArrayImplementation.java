package _15_Queues;

public class ArrayImplementation {
    public static class QueueA {
        int f = -1;
        int r = -1;
        int size = 0;
        private int[] arr = new int[5];
        public void add(int val){
            if(size== arr.length) {
                System.out.println("Queue is FULL");
                return;
            }
            if(f==-1){
                f = r = 0;
                arr[r] = val;
            }
            else {
                arr[++r] = val;
            }
            size++;
        }
        public int remove() {
            if(size==0) {
                System.out.print("Queue is Empty");
                return -1;
            }
            f++;
            size--;
            return arr[f-1];
        }
        public int peek() {
            if(size==0) {
                System.out.print("Queue is Empty");
                return -1;
            }
            return arr[f];
        }
        public boolean isEmpty() throws Error{
            if(size==0) return true;
            else return false;
        }
        public boolean isFull() throws Error{
            if(size==arr.length) return true;
            else return false;
        }
        public void display() throws Error{
            if(size==0) {
                System.out.println("Queue is Empty");
            }
            else {
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        QueueA q = new QueueA();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display();
        q.remove();
        q.display();
        System.out.println(q.peek());
        System.out.println(q.size);
    }
}
