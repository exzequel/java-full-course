package L29_OverloadedConstructors;

public class L29_OverloadedConstructors {
    public static void main(String[] args) {
        // Overloaded constructor - multiple constructors within a class with the same name, but have different parameters
        // name + parameter = signature

        // Object
        Pizza pizza = new Pizza("Thicc Crust", "Tomato");

        System.out.println("Here are the ingredients of your pizza: ");
        System.out.println(pizza.bread);
        System.out.println(pizza.sauce);
        System.out.println(pizza.cheese);
        System.out.println(pizza.topping);
    }
}
