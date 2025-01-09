package _9_BasicSortingAlgorithms.BubbleSort;

import java.util.ArrayList;
import java.util.Arrays;

public class PushZerostoEnd {
    public static void main(String[] args) {
        int[] arr = {1,0,4,-1,2,-40,100,0,5};
        ArrayList<Integer> ansHelper = new ArrayList<>();
        int noz = 0;
        for (int ele:arr){
            if (ele!=0) ansHelper.add(ele);
            else noz++;
        }
        for (int i = 0; i < noz; i++) {
            ansHelper.add(0);
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = ansHelper.get(i);
        }
        System.out.println(Arrays.toString(arr));
    }
}
