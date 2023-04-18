package L37_Abstraction;

public class L37_Abstraction {
    // abstract = abstract classes cannot be instatiated but they can have a subclass
    // abstract methods are declared without an implementation
    // prevents from creating classes that are too vague
    // adds a layer of security for your programs
    public static void main(String[] args) {
        // Vehicle vehicle = new Vehicle(); // abstract keyword prevents from creating instances of vehicle
        Car car = new Car();

        car.go();

    }
}
