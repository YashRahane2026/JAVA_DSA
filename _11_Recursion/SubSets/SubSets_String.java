package _11_Recursion.SubSets;
import java.util.ArrayList;
public class SubSets_String {
    static ArrayList<String> arr = new ArrayList<>(); // Global
    static void subSets(int i,String s,String ans){
        if(i==s.length()){
            arr.add(ans);
            return;
        }
        subSets(i+1,s,ans); // Not Take
        ans += s.charAt(i);
        subSets(i+1,s,ans); // Take
    }
    public static void main(String[] args) {
        String s = "abc";
        arr = new ArrayList<>(); // Reset -> Done for LeetCode -> Because leetcode run same test case in Arraylist
        subSets(0,s,"");
        System.out.println(arr);
    }
}
