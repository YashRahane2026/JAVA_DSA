package _9_BasicSortingAlgorithms.InsertionSort;

public class Insertion_Sort {
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
        int[] arr = {10,-4,20,7,8,-6};
        int n = arr.length;
        print(arr);
        //Insertion Sort - using for loop
//        for (int i = 1; i < n ; i++) {// 1 to n-1passes
//            for (int j = i; j >=1 ; j--) {
//                if (arr[j]<arr[j-1])
//                    swap(arr,j,j-1);
//                 else break;
//            }
//        }
        //............
        //We can also use both conditions of j>=1 && arr[j]<arr[j-1]
        //In while loop also
        //............
        //Insertion Sort
        for (int i = 1; i < n ; i++) {
            int j = i;
            while (j>=1 && arr[j]<arr[j-1]){
                swap(arr,j,j-1);
                j--;
            }
        }
        print(arr);
    }
}
