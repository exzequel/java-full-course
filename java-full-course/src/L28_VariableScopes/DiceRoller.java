package L28_VariableScopes;

import java.util.Random;

public class DiceRoller {

    Random random; // global
    int number; // global

    // Constructor class
    DiceRoller() {
        // Random random = new Random(); // local instance
        // int number = 0; // local variable
        // roll(random, number); // pass as arguments to make global

        // using global variables
        random = new Random();
        roll();
    }
    void roll() { // pass in parameters to make global (Random random, int number)
        number = random.nextInt(6)+1;
        System.out.println(number);
    }
    
}
