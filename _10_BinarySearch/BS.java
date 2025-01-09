package _10_BinarySearch;

public class BS {
    public static void main(String[] args) {
        int[] arr = {10,23,46,89,91,97,107,140,264};
        int target = 107;
        int lo = 0,hi = arr.length-1;
        boolean flag = false;
        while (lo<=hi){
            int mid = (lo+hi)/2;
            if (arr[mid]==target) {
                flag = true;break;
            }
            else if (arr[mid]>target) hi = mid-1;
            else if (arr[mid]<target) lo = mid+1;
        }
        if (flag==true) System.out.println("Target Found");
        else System.out.println("Target Not Found");
    }
}
