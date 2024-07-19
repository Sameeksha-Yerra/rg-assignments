import java.util.Optional;
public class Main {
    public static void main(String[] args) {
        // Create an Optional object that contains a value
        Optional<String> optionalValue = Optional.of("Hello, World!");
        // Create an Optional object that is empty
        Optional<String> emptyOptional = Optional.empty();
        // Use the Optional object
        if (optionalValue.isPresent()) {
            System.out.println("Value: " + optionalValue.get());
        } else {
            System.out.println("Value is not present");
        }
        // Using ifPresent to avoid null checks
        optionalValue.ifPresent(value -> System.out.println("Using ifPresent: " + value));
        // Providing a default value if the Optional is empty
        String defaultValue = emptyOptional.orElse("Default Value");
        System.out.println("Default Value: " + defaultValue);
        // Using orElseGet with a Supplier
        String suppliedValue = emptyOptional.orElseGet(() -> "Supplied Value");
        System.out.println("Supplied Value: " + suppliedValue);
    }
}
