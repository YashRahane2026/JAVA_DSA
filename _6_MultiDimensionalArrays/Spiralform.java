package _6_MultiDimensionalArrays;

public class Spiralform {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15},{16,17,18,19,20},{21,22,23,24,25},{26,27,28,29,30}};
        int m = arr.length,n = arr[0].length;


        int minR = 0,maxR = m-1,minC = 0,maxC = n-1;
        while (minR<=maxR && minC<=maxC){
            //left to right
            for (int i = minC; i <= maxC ; i++) {
                System.out.print(arr[minR][i]+" ");
            }
            //top to bottom
            if (minR>maxR || minC>maxC) break;
            minR++;
            for (int i = minR; i <= maxR ; i++) {
                System.out.print(arr[i][maxC]+" ");
            }
            maxC--;

            //right to left
            if (minR>maxR || minC>maxC) break;
            for (int i = maxC; i >= minC ; i--) {
                System.out.print(arr[maxR][i]+" ");
            }
            maxR--;

            //bottom to top
            if (minR>maxR || minC>maxC) break;
            for (int i = maxR; i >= minR ; i--) {
                System.out.print(arr[i][minC]+" ");
            }
            minC++;
        }
    }
}
