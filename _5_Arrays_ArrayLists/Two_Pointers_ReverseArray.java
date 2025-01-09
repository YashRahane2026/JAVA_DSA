package _5_Arrays_ArrayLists;

//Method 1
//public class Two_Pointers_ReverseArray {
//    public static void main(String[] args) {
//        int[] arr = {10,20,30,40,50,60,70};
//        for (int ele : arr){
//            System.out.print(ele+" ");
//        }
//        int n = arr.length;
//        for (int i = 0; i < n/2; i++) {
//            int temp = arr[i];
//            arr[i] = arr[n-1-i];
//            arr[n-1-i] = temp;
//        }
//        System.out.println();
//        for (int ele : arr){
//            System.out.print(ele+" ");
//        }
//    }
//}

//Method 2 (More Good)

public class Two_Pointers_ReverseArray {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        for (int ele : arr){
            System.out.print(ele+" ");
        }
        int n = arr.length;

        int i = 0;
        int j = n-1;
        while (i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            i++;
            j--; 
        }


        System.out.println();
        for (int ele : arr){
            System.out.print(ele+" ");
        }
    }
}
