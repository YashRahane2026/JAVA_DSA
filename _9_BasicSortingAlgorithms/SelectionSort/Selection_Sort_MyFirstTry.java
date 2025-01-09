package _9_BasicSortingAlgorithms.SelectionSort;

import java.util.Arrays;

public class Selection_Sort_MyFirstTry {
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {10,-4,20,1,8,-6};
        int n = arr.length;
        for (int i = 0; i < n-1 ; i++) {
            int min = arr[i];
            for (int j = i; j < n; j++) {
                if (arr[j]<min){
                    min = arr[j];
                }
                if (arr[j]==min) {
                    swap(arr,j, i);
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
