import java.util.Arrays;
import java.util.List;
public class LambdaExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry");
        // Using lambda expression
        strings.forEach(s -> System.out.println(s.toUpperCase()));
    }
}

import java.util.Arrays;
import java.util.List;

public class MethodReferenceExample {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("apple", "banana", "cherry");

        // Using method reference
        strings.forEach(MethodReferenceExample::printUpperCase);
    }

    public static void printUpperCase(String s) {
        System.out.println(s.toUpperCase());
    }
}
