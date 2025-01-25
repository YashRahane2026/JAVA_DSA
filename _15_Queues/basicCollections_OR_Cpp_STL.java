package _15_Queues;

import java.util.*;
// OR
import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class basicCollections_OR_Cpp_STL {
    public static void main(String[] args) {
        Queue<Integer> a = new ArrayDeque<>();
        //OR
        Queue<Integer> q = new LinkedList<>();
        //PUSH
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q);
        //POP
        q.remove(); // OR // q.poll();
        System.out.println(q);
        q.poll();
        System.out.println(q);
        //PEEK
        System.out.println(q.element());
        System.out.println(q.peek());
    }
}
