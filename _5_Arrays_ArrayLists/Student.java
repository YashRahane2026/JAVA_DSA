package _5_Arrays_ArrayLists;

public class Student {
    public static void main(String[] args) {
        int[] marks = {33,55,66,77,99,22,12};
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < 35){
                System.out.println(i+1);
            }
        }
    }
}
//
