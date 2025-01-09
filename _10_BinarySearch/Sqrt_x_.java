package _10_BinarySearch;

public class Sqrt_x_ {
    public static void main(String[] args) {
        int x = 16;
        int lo = 0,hi = x;
        while (lo<=hi){
            int m = lo + (hi-lo)/2;
            if (m == x/m) { // OR m*m = x
                System.out.println(lo);
                break;
            }
            else if (m > x/m) hi = m-1;
            else if (m < x/m) lo = m+1;
        }
    }
}
// Best code because it works in int
