package ClassExam;

import java.util.Arrays;

public class Difference {
    public static void main(String[] args) {
        int [] a = {211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};
        Arrays.sort(a);
        int diff = Integer.MAX_VALUE;
        for(int i=0; i<a.length-1; i++) {
            if(a[i+1]- a[i]<diff) {
                diff = a[i+1]-a[i];
            }
        }
        System.out.println(diff);
    }
}
