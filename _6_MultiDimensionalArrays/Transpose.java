package _6_MultiDimensionalArrays;

public class Transpose {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6}};
        int m = arr.length, n = arr[0].length;
        int[][] t = new int[n][m];
        for (int[] ele : arr){
            for (int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        //Storing
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                t[i][j] = arr[j][i];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(t[i][j]+" ");
            }
            System.out.println();
        }
    }
}
