interface MyInterface {
    // Abstract method
    void abstractMethod();    // Default method
    default void defaultMethod() {
        System.out.println("This is a default method.");
    }
    // Static method
    static void staticMethod() {
        System.out.println("This is a static method.");
    }
}
class MyClass implements MyInterface {
    @Override
    public void abstractMethod() {
        System.out.println("Implementation of abstract method.");
    }
}
public class Default_Static {
    public static void main(String[] args) {
        MyClass myClass = new MyClass();
        // Call the abstract method
        myClass.abstractMethod();
        // Call the default method
        myClass.defaultMethod();
        // Call the static method
        MyInterface.staticMethod();
    }
}
