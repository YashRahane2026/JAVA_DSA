import java.util.Arrays;
import java.util.Stack;

class Main{
    public static int celebrity(int arr[][]) {
        int m = arr.length,n = arr[0].length;
        int i=0,j=0;
        while(i<m && j<n){
            boolean flag = true;
            for(int a=0;a<n;a++){
                if(arr[i][a]==1) flag = false;
            }
            if(flag){
                int noz=0,noo=0;
                for(int b=0;b<m;b++){
                    if(arr[b][j]==1)noo++;
                    else noz++;
                }
                if(noo==n-2) return i;
                if(j==n-1 && i!=m-1) j=0;
                else j++;
            } else {
                i++;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[][] arr = {{0,1,0},{0,0,0},{0,1,0}};
        System.out.println(celebrity(arr));
    }
}