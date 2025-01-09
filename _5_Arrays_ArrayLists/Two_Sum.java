package _5_Arrays_ArrayLists;

public class Two_Sum {
    public static void main(String[] args) {
        int[] arr = {3,-1,8,5,4,9,2};
        int x = 9;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] + arr[j] == x){
                    System.out.println("Indexes:"+i+","+j);
                    break;
                }
            }
        }
    }
}
