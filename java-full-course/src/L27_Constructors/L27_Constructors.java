package L27_Constructors;

public class L27_Constructors {
    // constructor = special method that is called when an object is instantiated (created)
    // constructors allows to construct objects that have varying attributes
    // constructor = unique object

    public static void main(String[] args) {
        // pass arguments to a constructor
        Human human = new Human("Ricky", 21, 90);
        Human human2 = new Human("Morty", 16, 50);

        System.out.println(human.name);
        System.out.println(human2.name);

        human2.eat();
        human.drink();

    }
    
}
