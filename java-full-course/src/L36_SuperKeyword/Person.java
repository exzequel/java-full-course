package L36_SuperKeyword;

public class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return this.name + "\n" + this.age + "\n";
    }
}
