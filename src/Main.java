import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> test = new ArrayList<>();
        test.add(4);
        test.add(7);
        test.add(8);
        test.add(5);
        test.remove(2);
        System.out.println(test);
        System.out.printf("Array's length: %s%n", test.size());
        test.forEach(System.out::println);
    }
}