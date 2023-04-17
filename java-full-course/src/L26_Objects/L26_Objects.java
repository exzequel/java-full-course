package L26_Objects;
public class L26_Objects {
    public static void main(String[] args) {
        // object = an instance of a class that may contain attributes and methods
        // attributes = characteristics
        // methods = different actions

        // construct instance of class
        Car myCar = new Car();
        Car otherCar = new Car();

        System.out.println(myCar.make);
        System.out.println(myCar.model);

        System.out.println(otherCar.make);
        System.out.println(otherCar.model);

        // myCar.drive();
        // myCar.brake();
    }
}
