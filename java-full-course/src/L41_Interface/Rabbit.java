package L41_Interface;

// works like an abstract method
public class Rabbit implements Prey{
    @Override
    public void flee() {
        System.out.println("The rabbit is fleeing");
    }
}
