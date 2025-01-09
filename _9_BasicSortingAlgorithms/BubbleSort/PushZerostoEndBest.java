package _9_BasicSortingAlgorithms.BubbleSort;

public class PushZerostoEndBest {
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
        int[] arr = {1,0,4,-1,2,-40,100,0,5};
        int n = arr.length;
        int noz = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==0){
                noz++;
            }
        }
        for (int i = 0; i < noz ; i++) {
            for (int j = 0; j < n-1-i ; j++) {
                if (arr[j]==0){
                    swap(arr,j,j+1);
                }
            }
        }
        print(arr);
    }
}
