package _5_Arrays_ArrayLists;

import java.util.Arrays;

public class Sort_0_1_2_Dutch_flag_algo {
    static void swap(int[] arr,int i,int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    public static void main(String[] args) {
        int[] nums = {0,1,2,0,1,2,1,2,0,0};
        int n = nums.length;
        int mid = 0, hi = n-1, lo = 0;
        while (mid <= hi){
            if (nums[mid] == 0){
                swap(nums,lo,mid);
                lo++;
                mid++;
            } else if (nums[mid] == 1) {
                mid++;
            } else if (nums[mid] == 2) {
                swap(nums,mid,hi);
                hi--;
            }
        }
        System.out.println(Arrays.toString(nums));
    }
}
