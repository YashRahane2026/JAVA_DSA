package _14_Stacks;

public class ArrImplementation {
    public static class Stack{
        private int[] arr = new int[5];
        int idx = 0; // VVV IMP...
        void push(int x) throws Error{
            if(idx==arr.length) throw new Error("Stack Overflow");
            arr[idx] = x;
            idx++;
        }
        int pop() throws Error{
            if(idx==0) throw new Error("Stack if Empty");
            int top = arr[idx-1];
            arr[idx-1] = 0;
            idx--;
            return top;
        }
        int peek() throws Error{
            if(idx==0) throw new Error("Stack if Empty");
            return arr[idx-1];
        }
        void display(){
            for(int i=0;i<=idx-1;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(size()==0) return true;
            else return false;
        }
        boolean isFull(){
            if(idx== arr.length) return true;
            else return false;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(1);
        st.push(0);
        st.push(-1);
        st.push(-2);
        st.push(-3);
        st.display();
        System.out.println(st.peek());
        st.pop();
        st.display();

    }
}
