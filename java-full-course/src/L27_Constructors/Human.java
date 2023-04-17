package L27_Constructors;

public class Human {

    String name;
    int age;
    double weight;
    
    // constructor
    Human(String name, int age, double weight) {
        // to access attributes within its class use the this keyword
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    void eat(){
        System.out.println(this.name + " is eating");
    }
    void drink(){
        System.out.println(this.name + " is drinking");
    }
}
