package _9_BasicSortingAlgorithms.BubbleSort;

public class Method3_Optimised {
    static void print(int[] arr){
        for (int ele : arr){
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
        int[] arr = {1,2,3,4,5};
        print(arr);
        int n = arr.length;
        for (int i = 0; i < n-1  ; i++) {
            boolean flag = true;
            for (int j = 0; j < n-1-i ; j++) {
                if (arr[j]>arr[j+1]){
                    swap(arr,j,j +1);
                    flag = false;
                }
            }
            // check if this pass has sorted or not
            if (flag==true) break;
        }
        print(arr);
    }
}
