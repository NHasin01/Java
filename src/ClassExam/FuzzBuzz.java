package ClassExam;

public class FuzzBuzz {
    public static void main(String[] args) {
        int n = 125;

        for(int i =1; i<=n; i++) {
            if (i % 5 == 0 && i % 3 == 0) {
                System.out.println(i + "FuzzBuzz");
            } else if (i % 3 == 0) {
                System.out.println("Fuzz");
            } else if (i % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println(i);
            }
        }
    }
}
