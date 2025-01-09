package _11_Recursion.SubSets;

import java.util.ArrayList;

public class HW {
    static ArrayList<String> arr = new ArrayList<>();
    static void subSets(int i,int[] a,String ans){
        if(ans.length()==3){
            arr.add(ans);
            return;
        }
        if(i==a.length) return;
        subSets(i+1,a,ans+a[i]); // Not Take
        subSets(i+1,a,ans); // Take
    }
    public static void main(String[] args) {
        arr = new ArrayList<>(); // Reset -> Done for LeetCode -> Because leetcode run same test case in same Arraylist
        int[] a = {1,2,3,4,5};
        String s = "";
        subSets(0,a,s);
        System.out.println(arr);
    } 
}
