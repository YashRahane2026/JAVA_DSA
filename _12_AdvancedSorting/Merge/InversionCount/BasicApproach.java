package _12_AdvancedSorting.Merge.InversionCount;

public class BasicApproach {
    public static void main(String[] args) {
        int[] arr = {8,2,5,3,1,4};
        int count = 0;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
