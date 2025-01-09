package _6_MultiDimensionalArrays;

public class Waveform {
    static void print(int[][] arr){
        for (int[] ele : arr ){
            for (int x: ele){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        print(arr);

        for (int i = 0; i < arr.length; i++) { // Rows
            if (i%2 == 0){
                for (int j = 0; j < arr[0].length; j++) { // Cols
                    System.out.print(arr[i][j]+" ");
                }
            } else {
                for (int j = arr[0].length-1; j >= 0 ; j--) { // Cols
                    System.out.print(arr[i][j]+" ");
                }
            }
        }
    }
}

//Try for all waveforms

//public static void main(String[] args) {
//    int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//    print(arr);
//    int m = arr.length, n = arr[0].length;
//    for (int i = 0; i < n; i++) {
//        if (i%2==1){
//            for (int j = 0; j < m; j++) {
//                System.out.print(arr[j][i]+" ");
//            }
//        } else {
//            for (int j = m-1; j >= 0; j--) {
//                System.out.print(arr[j][i]+" ");
//            }
//        }
//    }
//}
