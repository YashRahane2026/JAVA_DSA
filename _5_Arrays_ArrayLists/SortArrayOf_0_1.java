package _5_Arrays_ArrayLists;

import java.util.Arrays;

//Method 1

//public class SortArrayOf_0_1 {
//    public static void main(String[] args) {
//        int[] arr = {1,0,1,0,0,0,1,1};
//        int zeros = 0;
//        int ones = 0;
//        for (int i = 0; i < arr.length; i++) {
//            if (arr[i] == 0){
//                zeros++;
//            } else {
//                ones++;
//            }
//        }
//        for (int i = 0; i < zeros; i++) {
//            arr[i] = 0;
//        }
//        for (int i = zeros; i <arr.length ; i++) {
//            arr[i] = 1;
//        }
//        System.out.println(Arrays.toString(arr));
//    }
//}

//Good Method(For Interview)

public class SortArrayOf_0_1 {
    public static void main(String[] args) {
        int[] arr = {0,0,0,1,1,1};
        int i = 0;
        int j = arr.length-1;
        while (i < j){ //Don't do <= (in case of equal to 0,1 => 1,0)
            if (arr[i] == 0) i++;
            else if (arr[j] == 1) j--;
            else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}