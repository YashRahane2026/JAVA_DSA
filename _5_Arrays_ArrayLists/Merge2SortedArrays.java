package _5_Arrays_ArrayLists;

import java.util.Arrays;

public class Merge2SortedArrays {
    public static void main(String[] args) {
        int[] a = {11,33,42,71};
        int[] b = {26,54,69,81,92,111};
        int[] c = new int[a.length+ b.length];
        int i = 0,j = 0,k = 0;
        while (i < a.length && j < b.length){
            if (a[i] <= b[j]){
                c[k++] = a[i++];
            } else {
                c[k++] = b[j++];
            }
        }
        while (j < b.length) {
            c[k++] = b[j++];
        }
        while (i < a.length) {
            c[k++] = a[i++];
        }
        System.out.println(Arrays.toString(c));
    }
}

//public class Merge2SortedArrays {
//    public static void main(String[] args) {
//        int[] a = {11,33,42,71};
//        int[] b = {26,54,69,81,92,111};
//        int[] c = new int[a.length+ b.length];
//        int i = a.length-1,j = b.length-1,k = a.length+b.length-1;
//        while (i >= 0 && j >= 0){// not
//            if (a[i] >= b[j]){
//                c[k] = a[i];
//                i--; k--;
//            } else {
//                c[k] = b[j];
//                j--;k--;
//            }
//        }
//        if (i < 0) {
//            while (j >= 0) {
//                c[k] = b[j];
//                j--;k--;
//            }
//        }
//        if (j < 0) {
//            while (i >= 0) {
//                c[k] = a[i];
//                i--;k--;
//            }
//        }
//
//        System.out.println(Arrays.toString(c));
//    }
//}
