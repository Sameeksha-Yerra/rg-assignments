import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
public class MapExample {
    public static void main(String[] args) {
        // List of strings
        List<String> strings = Arrays.asList("apple", "banana", "cherry", "date");

        // Convert each string to uppercase using map
        List<String> upperCaseStrings = strings.stream()
                                               .map(String::toUpperCase)
                                               .collect(Collectors.toList());

        // Print the list of uppercase strings
        upperCaseStrings.forEach(System.out::println);
    }
}
