package _5_Arrays_ArrayLists;

public class Sort_0_1_2 {
    public static void main(String[] args) {
        int[] nums = {0,0,0,1,1,1,2,2,2};
        int noOfZeros = 0;
        int noOfOnes = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) noOfOnes++;
            else if (nums[i] == 1) {
                noOfOnes++;
            }
        }
        for (int i = 0; i < noOfOnes; i++) {
            nums[i] = 0;
        }
        for (int i = noOfZeros; i < noOfOnes+noOfZeros; i++) {
            nums[i] = 1;
        }
        for (int i = noOfZeros+noOfOnes; i < nums.length ; i++) {
            nums[i] = 2;
        }
    }
}
