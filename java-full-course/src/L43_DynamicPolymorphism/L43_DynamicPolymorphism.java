package L43_DynamicPolymorphism;

import java.util.Scanner;

public class L43_DynamicPolymorphism {
    public static void main(String[] args) {
        // polymorphism = manys shapes and forms
        // dynamic = after compilation (during runtime)
        // ex. a corvette is a: corvette, and a car, and a vehicle, and an object

        Scanner scanner = new Scanner(System.in);

        Animal animal = new Animal();
        // Dog dog = new Dog();
        // Cat cat = new Cat();

        System.out.println("What animal do you want?");
        System.out.println("1 - dog, 2 - cat: ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            animal = new Dog();
            animal.speak();
        }
        else if (choice == 2) {
            animal = new Cat();
            animal.speak();
        }
        else {
            animal = new Animal();
            System.out.println("That choice was invalid.");
            animal.speak();
        }

    }
}
