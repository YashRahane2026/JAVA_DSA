package _5_Arrays_ArrayLists;

import java.util.ArrayList;

public class ArrayList_Basics {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>(3);
        arr.add(0,3); // arr[0] => X
        arr.add(1,4);
        arr.add(2,5);
        arr.add(44); // PUSH BACK
        System.out.println(arr);

        arr.set(0,2);
        System.out.println(arr.get(1));

        for (int i = 0; i < arr.size(); i++) {
            System.out.print(arr.get(i)+" ");
        }

        arr.remove(1);
        System.out.println("\n"+arr);
    }
}
