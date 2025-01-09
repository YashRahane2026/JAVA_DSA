package _6_MultiDimensionalArrays;

public class ScoreAfterFlippingMatrix {
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
        int[][] arr = {{0,0,1,1},{1,0,1,0},{1,1,0,0}};
        int m = arr.length,n = arr[0].length;
        print(arr);

        for (int i = 0; i < m; i++) {
            if (arr[i][0] == 0){
                for (int j = 0; j < n; j++) {
                    if (arr[i][j]==1) arr[i][j] = 0;
                    else arr[i][j] = 1;
                }
            }
        }
        print(arr);

        for (int j = 1; j < n; j++) {
            int noo = 0,noz = 0;
            for (int i = 0; i < m; i++) {
                if(arr[i][j] == 1) noo++;
                else noz++;
            }
            if (noo<noz){
                for (int i = 0; i < m ; i++) {
                    if(arr[i][j] == 1) arr[i][j] = 0;
                    else arr[i][j] = 1;
                }
            }
        }
        print(arr);
        // For Finding score
        int score = 0;
        int x = 1;
        for(int j=n-1;j>=0;j--){
            for(int i=0;i<m;i++){
                score += (arr[i][j]*x);
            }
            x *= 2;
        }
        System.out.println(score);
    }
}
