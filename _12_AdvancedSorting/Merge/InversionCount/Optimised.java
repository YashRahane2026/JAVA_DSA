package _12_AdvancedSorting.Merge.InversionCount;

public class Optimised {
    static int count;
    static void print(int[] arr){
        for(int ele : arr){
            System.out.print(ele+" ");
        }
        System.out.println();
    }
    static void merge(int[] a,int[] b,int[] arr){
        int i=0,j=0,k=0;
        while (i<a.length && j<b.length){
            if(a[i]<=b[j]){
                arr[k++] = a[i++];
            } else { // a[i] > b[j] // No req of inversion
                count += (a.length-i);
                arr[k++] = b[j++];
            }
        }
        while (i<a.length) arr[k++] = a[i++];
        while (j<b.length) arr[k++] = b[j++];
    }
    static void mergeSort(int[] arr){
        int n = arr.length;
        if(n==1) return;
        int[] a = new int[n/2];
        int[] b = new int[n-n/2];
        for(int i=0;i<n/2;i++){
            a[i] = arr[i];
        }
        for(int i=0;i<n-n/2;i++){
            b[i] = arr[n/2+i];
        }
        mergeSort(a);
        mergeSort(b);
        merge(a,b,arr);
        //Improve S.C
        a = null; b = null;
    }
    public static void main(String[] args) {
        int[] arr = {109,33,89,27,60,10,70};
        mergeSort(arr);
        print(arr);
        System.out.println(count);
    }
}
