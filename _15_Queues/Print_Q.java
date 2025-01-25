package _15_Queues;

import java.util.LinkedList;
import java.util.Queue;

public class Print_Q {
    public static void main(String[] args) {
        Queue<Integer> q = new LinkedList<>();
        //PUSH
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        for(int i=0;i<q.size();i++){
            int ele = q.remove();
            System.out.print(ele+" ");
            q.add(ele);
        }
        System.out.println();
        System.out.println(q);
    }
}
