package L35_MethodOverriding;

public class L35_MethodOverriding {
    public static void main(String[] args) {
        // method overriding = declaring a method in a sub class, which is already present in parent class
        // done so that child class can give its own implementation

        Animal animal = new Animal();
        Dog dog = new Dog();

        animal.speak();
        dog.speak();
    }
}
