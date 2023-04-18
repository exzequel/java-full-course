package L36_SuperKeyword;

public class L36_SuperKeyword {
    public static void main(String[] args) {
        // super = keyword that refers to the superclass (parent) of an object
        // very similar to the 'this' keyword
        
        Hero hero1 = new Hero("Batman", 42, "Money");
        Hero hero2 = new Hero("Superman", 43, "Everything");

        System.out.println(hero1.name);
        System.out.println(hero1.age);
        System.out.println(hero1.power);

        System.out.println(hero2.toString());
    }   
}
