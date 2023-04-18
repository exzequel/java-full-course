package L30_toString;

public class Car {
    String make = "Ford";
    String model = "Mustang";
    String color = "Red";
    int year = 2021;

    // declare toString method
    public String toString() {
        String myString = make + "\n" + model + "\n" + color + "\n" + year;
        return myString;
    }
}
