package _9_BasicSortingAlgorithms.SelectionSort;
//Sort a given Array in increasing order using selection sort,
//but in each pass, put the kth maximum element at the right
//position.
public class HW_2 {
    static void print(int[] arr){
        for (int ele : arr ){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] arr = {3,1,2,5,4};
        int n = arr.length;
        print(arr);
        for (int i = n-1; i > 0; i--) {
            int max = Integer.MIN_VALUE;
            int maxdx = -1;
            for (int j = 0; j<=i; j++) {
                if (arr[j]>max){
                    max = arr[j];
                    maxdx = j;
                }
            }
            swap(arr,i,maxdx);
        }
        print(arr);
    }
}
