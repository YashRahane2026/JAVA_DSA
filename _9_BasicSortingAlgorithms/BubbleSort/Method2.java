package _9_BasicSortingAlgorithms.BubbleSort;
//n-1-i
public class Method2 {
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
        int n = arr.length;
        for (int i = 0; i < n-1  ; i++) {
            for (int j = 0; j < n-1-i ; j++) {//here n-1-i
                if (arr[j]>arr[j+1]){
                    swap(arr,j,j +1);
                }
            }
        }
        print(arr);
    }
}
