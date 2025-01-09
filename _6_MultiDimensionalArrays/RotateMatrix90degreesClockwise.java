package _6_MultiDimensionalArrays;

public class RotateMatrix90degreesClockwise {
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
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
        print(arr);

        int m = arr.length;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < i; j++) {
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }
        print(arr);

        for (int i = 0; i < m; i++) {
            int a = 0,b = m-1;
            //reverse
            while (a<b){
                int temp = arr[i][a];
                arr[i][a] = arr[i][b];
                arr[i][b] = temp;
                a++;
                b--;
            }
        }
        //OR//.....
//        int a = 0,b = m-1;
//        while(a<b){
//            for(int i=0;i<m;i++){
//                int temp = arr[i][a];
//                arr[i][a] = arr[i][b];
//                arr[i][b] = temp;
//            }
//            a++;
//            b--;
//        }
        print(arr);
    }
}

// One more new Approch found by me

//static void swap(int[][] arr,int i,int j){
//    int temp = arr[i][j];
//    arr[i][j] = arr[j][i];
//    arr[j][i] = temp;
//}
//static void print(int[][] arr){
//    System.out.println();
//    for (int[] ele : arr ){
//        for (int x: ele){
//            System.out.print(x+" ");
//        }
//        System.out.println();
//    }
//
//}
//public static void main(String[] args) {
//    int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};
//    print(arr);
//    int m = arr.length,n = arr[0].length;
//    for (int i = 0; i < m ; i++) {
//        for (int j = 0; j < i; j++) {
//            swap(arr,i,j);
//        }
//    }
//    print(arr);
//    int i = 0,j = arr.length-1;
//    while (i < j){
//        for (int k = 0; k < arr.length ; k++) {
//            int temp = arr[k][i];
//            arr[k][i] = arr[k][j];
//            arr[k][j] = temp;
//        }
//        i++;j--;
//    }
//    print(arr);
//}
