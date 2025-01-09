import java.util.Arrays;
public class RandomQ {
    public static void main(String[] args) {
        int[] a = {11,33,42,71};
        int[] b = {33,69,81,92,111};
        int[] c = new int[a.length+ b.length];
        int i = 0,j = 0,k = 0;
        while (i < a.length && j < b.length){
            if (a[i] <= b[j]){
                c[k] = a[i];
                i++;
            } else {
                c[k] = b[j];
                j++;
            }
            k++;
        }
        if (i == a.length) {
            while (j < b.length) {
                c[k] = b[j];
                j++;k++;
            }
        }
        if (j == b.length) {
            while (i < a.length) {
                c[k] = a[i];
                i++;k++;
            }
        }
        System.out.println(Arrays.toString(c));
        int pos = -1;
        int rep = 0;
        int repCount = 0;
        for (int l = 0; l < c.length; l++) {
            if (c[rep]==c[l]){
                pos = l;
                repCount++;
            }
            rep = l;
        }

        System.out.println(pos);
    }
}
