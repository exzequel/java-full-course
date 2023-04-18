package L32_ObjectPassing;

public class L32_ObjectPassing {
    public static void main(String[] args) {

        Garage garage = new Garage();
        Car car = new Car("BMW");
        Car car1 = new Car("Tesla");

        garage.park(car1);
    }
}
