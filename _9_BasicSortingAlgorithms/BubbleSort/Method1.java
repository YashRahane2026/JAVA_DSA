package _9_BasicSortingAlgorithms.BubbleSort;
//n-1
public class Method1 {
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
        int[] arr = {10,4,1,0,-2};
        print(arr);
        for (int i = 0; i < arr.length-1  ; i++) {
            for (int j = 0; j < arr.length-1 ; j++) {
                if (arr[j]>arr[j+1]){
                    swap(arr,j,j +1);
                }
            }
        }
        print(arr);
    }
}
