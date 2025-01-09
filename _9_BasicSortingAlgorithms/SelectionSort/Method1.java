package _9_BasicSortingAlgorithms.SelectionSort;

public class Method1 {
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
        int[] arr = {10,-4,20,1,8,-6};
        int n = arr.length;
        print(arr);
        for (int i = 0; i < n-1; i++) {
            int min = Integer.MAX_VALUE;
            int mindex = -1;
            for (int j = i; j < n ; j++) { // i also check for
                if (arr[j]<min){        // j = i+1 and i find this is more optimised
                    min = arr[j];
                    mindex = j;
                }
            }
            swap(arr,i,mindex);
        }
        print(arr);
    }
}
