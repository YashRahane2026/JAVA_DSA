package _15_Queues;

public class CircularQueueArr {
    public static class Cqa{
        int front = -1;
        int rear = -1;
        int size = 0;
        int[] arr = new int[5];
        public void add(int val) throws Exception{
            if(size==arr.length) throw new Exception("Queue is Full");
            else if(size==0){
                front = rear = 0;
                arr[0] = val;
            } else if (rear<arr.length-1) {
                arr[++rear] = val;
            } else if (rear==arr.length-1){
                rear = 0;
                arr[0] = val;
            }
            size++;
        }
        public int remove() throws Exception{
            if (size==0) throw new Exception("Queue is Empty");
            else if(front==arr.length-1){
                int x = arr[front];
                front = 0;
                size--;
                return x;
            } else {
                int x = arr[front];
                front++;
                size--;
                return x;
            }
        }
        public int peek() throws Exception{
            if (size==0) throw new Exception("Queue is Empty");
            return arr[front];
        }
        public void display(){
            if (size==0) {
                System.out.println("Queue is Empty");
                return;
            }
            if(front<=rear){
                for (int i=front;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            } else {
                for (int i=front;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                for (int i=0;i<=rear;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
            }
        }
        public boolean isEmpty(){
            if(size==0) return true;
            else return false;
        }
    }
    public static void main(String[] args) throws Exception {
        Cqa q = new Cqa();
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.display(); // 1 2 3 4
        q.remove();
        q.display(); //   2 3 4
        q.add(5);
        q.display(); //   2 3 4 5
        q.add(6);
        q.display(); // 6 2 3 4 5 -> 2 3 4 5 6
        q.add(7);
    }
}
