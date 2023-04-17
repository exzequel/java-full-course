public class L22_Methods {
    public static void main(String[] args) {
        // method - block of code executed whenever it is called upon
        // this main code block is a method
        // arguments are the values you pass in to the method
        // in order to that the method must have parameters set to match the argumetns

        // String name = "Bro";
        // int age = 24;

        // hello(name); // arguments are what will be passed to the method
        // hello(name, age);

        int x = 3;
        int y = 4;
        
        System.out.println(add(x, y));   
    }

    // static void hello(String name, int age) { // parameters are the rules or variables you set to the method
    //     System.out.println("Hello" + name);
    //     System.out.println("You are " + age);
    // }

    // we normally use void if we aren't returning a value
    static int add(int x, int y) {

        int z = x + y;
        return z;
    }
}
