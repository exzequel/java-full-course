package L30_toString;
public class L30_toString {
    public static void main(String[] args) {
        // toString() = special method that all objects inherit, that returns a string that "textually represents" an object
        // can be used both implictly and explicitly

        Car car = new Car();

        // System.out.println(car.toString()); // explicitly
        System.out.println(car); // implicitly

        // System.out.println(car.make);
        // System.out.println(car.model);
        // System.out.println(car.color);
        // System.out.println(car.year);
    }
}
