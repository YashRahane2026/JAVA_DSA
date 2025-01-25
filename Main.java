import _15_Queues.CircularQueueArr;

class Main{
    public static class Cqa{
        int f = -1;
        int r = -1;
        int size = 0;
        int[] arr = new int[5];
        public void add(int val) throws Exception{
            if(size==arr.length) throw new Exception("Q is FULL");
            else if(size==0){
                f = r = 0;
                arr[0] = val;
            } else if(r<arr.length-1){
                arr[++r] = val;
            } else if(r==arr.length-1){
                r = 0;
                arr[r] = val;
                r++;
            }
            size++;
        }
        public int remove() throws Exception{
            if(size==0) throw new Exception("Q is Empty");
            if(f==arr.length-1){
                int x = arr[f];
                f = 0;
                size--;
                return x;
            } else {
                int x = arr[f];
                f++;
                size--;
                return x;
            }
        }
        public int peek()throws Exception{
            if(size==0) throw new Exception("Q is Empty");
            return arr[f];
        }
        public void display(){
            if(size==0) {
                System.out.println("Q is Empty");
                return;
            }
            if (f<=r){
                for(int i=f;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            } else {
                for (int i=f;f<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                for (int i=0;i<=r;i++){
                    System.out.print(arr[i]+" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) throws Exception{
        CircularQueueArr.Cqa q = new CircularQueueArr.Cqa();
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