package ClassExam;

public class Fibonacci {
    public static void main(String[] args) {
        int first = 0;
        int second = 1;
        int fibo;
        System.out.println(first + second);
        for (int i =3; i<=40; i++) {
            fibo = first + second;
            System.out.println(fibo);
            first = second;
            second = fibo;
        }
    }
}
