package L35_MethodOverriding;

public class Dog extends Animal {
    
    // own implementation of method
    // overriding method
    @Override
    void speak() {
        System.out.println("The dog barks woof woof");
    }
}
