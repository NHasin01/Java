package ClassExam;

import java.util.HashMap;

public class DuplicateWord {
    public static void main(String[] args) {
        String str = "My name is Nazia";
        HashMap<String,Integer> x = new HashMap<>();
        String[] word = str.split("");
        for(String y : word) {
            Integer i = x.get(y);
            if (i == null)
                x.put(y,1);
            else {
                x.put(y, i + 1);
            }
        }
        System.out.println(x);
    }
}
