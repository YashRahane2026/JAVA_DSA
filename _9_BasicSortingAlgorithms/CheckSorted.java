package _9_BasicSortingAlgorithms;

public class CheckSorted {
    public static void main(String[] args) {
        int[] arr = {1,4,7,6,10,12};
        boolean sort = true;
        for (int i = 0; i < arr.length-1; i++) {//My mistake arr.length-1
            if (arr[i]>arr[i+1]) {
                sort =false;
                break;
            }
        }
        System.out.println(sort);
    }
}
