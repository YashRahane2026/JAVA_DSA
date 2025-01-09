package _6_MultiDimensionalArrays;

public class LargestElement {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5678,6}};
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if (arr[i][j] > max){
                    //max = arr[i][j];//OR
                    max = Math.max(max,arr[i][j]);
                }
            }
        }
        System.out.println(max);
    }
}

