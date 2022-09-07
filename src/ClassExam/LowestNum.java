package ClassExam;

import java.util.Arrays;

public class LowestNum {
    public static void main(String[] args) {
        int a[] = {211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};
        int b=a.length;
        Arrays.sort(a);
        System.out.println(a[0]);
    }
}
