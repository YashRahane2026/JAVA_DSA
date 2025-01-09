package _6_MultiDimensionalArrays;

public class SquareMatrixTranspose {
    static void swap(int[][] arr,int i,int j){
        int temp = arr[i][j];
        arr[i][j] = arr[j][i];
        arr[j][i] = temp;
    }
    //Without using extra Array
    public static void main(String[] args) {
        int[][] a = {{1,2,3},{4,5,6},{7,8,9}};
        int m = a.length,n = a[0].length;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println();

        //Main Logic
        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < i; j++) {// <= and < both correct because we don't need to swap (0,0) like elements
                swap(a,i,j);
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
    }
}
