package L39_Encapsulation;

public class L39_Encapsulation {
    public static void main(String[] args) {
        // Encapsulation = attributes of class will be hidden or private
        // can be accessed only through methods (getters and setters)
        // You should always make attributes private if you don't have a reason to make them public or protected

        Car car = new Car("Chevrolet", "Camaro", 2021);

        car.setYear(2022);
        car.setModel("Tesla");

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
        

    }
}
