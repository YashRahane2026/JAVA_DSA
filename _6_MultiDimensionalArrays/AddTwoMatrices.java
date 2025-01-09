package _6_MultiDimensionalArrays;

//public class AddTwoMatrices {
//    public static void main(String[] args) {
//        int[][] a = {{2,2},{2,2}};
//        int[][] b = {{1,1},{1,1}};
//        int[][] ans = new int[2][2];
//        for (int i = 0; i < a.length; i++) {
//            for (int j = 0; j < a[0].length; j++) {
//                ans[i][j] = a[i][j] + b[i][j];
//            }
//        }
//        for (int[] ele : ans){
//            for (int x : ele){
//                System.out.print(x+" ");
//            }
//            System.out.println();
//        }
//    }
//}

// Without Extra Array
public class AddTwoMatrices {
    public static void main(String[] args) {
        int[][] a = {{2,2},{2,2}};
        int[][] b = {{1,1},{1,1}};

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                a[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int[] ele : a){
            for (int x : ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
