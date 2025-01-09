package _6_MultiDimensionalArrays;

public class MatrixMultiplication {
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
        int[][] a = {{1,2,1},{2,1,2}};
        int[][] b = {{1,0,1,2},{2,1,0,0},{0,3,1,1}};
        int[][] c = new int[a.length][b[0].length];

        for (int i = 0; i < c.length; i++) {
            for (int j = 0; j < c[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    c[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        print(a);
        print(b);
        print(c);
    }
}
