import java.util.Arrays;
import java.util.List;
public class LambdaExample {
    public static void main(String[] args) {
        // List of strings
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");
        // Sort the list using a lambda expression
        strings.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        // Print the sorted list
        strings.forEach(System.out::println);
    }
}
