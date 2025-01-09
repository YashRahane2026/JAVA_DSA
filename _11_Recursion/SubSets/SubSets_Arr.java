package _11_Recursion.SubSets;

import java.util.ArrayList;
import java.util.List;

public class SubSets_Arr {
    static List<List<Integer>> arr = new ArrayList<>();
    static void subSets(int i,int[] a,ArrayList<Integer> ans){
        if(i==a.length){
            ArrayList<Integer> list = new ArrayList<>();
            for(int j=0;j<ans.size();j++){
                list.add(ans.get(j));
            }
            arr.add(list);
            return;
        }
        subSets(i+1,a,ans);
        ans.add(a[i]);
        subSets(i+1,a,ans);
        ans.remove(ans.size()-1);
    }
    public static void main(String[] args) {
        arr = new ArrayList<>(); // Reset -> Done for LeetCode -> Because leetcode run same test case in same Arraylist
        int[] a = {1,2,3};
        ArrayList<Integer> ans = new ArrayList<>();
        subSets(0,a,ans);
        System.out.println(arr);
    }
}
