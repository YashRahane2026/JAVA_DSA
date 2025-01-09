package _11_Recursion.SubSets;

import java.util.ArrayList;
import java.util.List;

public class HW2 {
    static List<List<Integer>> arr;
    static void helper(int[] nums, int n, ArrayList<Integer> ans){
        if(n==nums.length){
            ArrayList<Integer> list = new ArrayList<>();
            for(int i=0;i<ans.size();i++){
                list.add(ans.get(i));
            }
            if(list.size()==4) {
                arr.add(list);
            }
            return;
        }
        helper(nums,n+1,ans);
        ans.add(nums[n]);
        helper(nums,n+1,ans);
        ans.remove(ans.size()-1);
    }
    static List<List<Integer>> subsets(int[] nums){
        arr = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();
        helper(nums,0,ans);
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(subsets(arr));
    }
}
