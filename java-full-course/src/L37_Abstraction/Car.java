package L37_Abstraction;

public class Car extends Vehicle{
    
    // forced to override or implement abstract methods
    @Override
    void go() {
        System.out.println("You are driving the car");
    }
}
