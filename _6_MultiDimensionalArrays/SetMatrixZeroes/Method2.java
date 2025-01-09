package _6_MultiDimensionalArrays.SetMatrixZeroes;

public class Method2 {
    static void print(int[][] arr){
        System.out.println();
        for (int[] ele : arr ){
            for (int x: ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int[][] arr = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        print(arr);
        int m = arr.length,n = arr[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (arr[i][j] == 0) {
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        //when row is true 0
        for (int i = 0; i < m; i++) {
            if (row[i]){
                for (int j = 0; j < n; j++) {
                    arr[i][j] = 0;
                }
            }
        }
        //when col is true 0
        for (int j = 0; j < n; j++) {
            if (col[j]){
                for (int i = 0; i < m; i++) {
                    arr[i][j] = 0;
                }
            }
        }
        print(arr);
    }
}
