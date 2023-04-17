public class L25_FinalKeyword {
    public static void main(String[] args) {
        // anything that is final cannot be reasigned
        // common naming convention is to CAPITALIZE all final variables
        
        final double PI = 3.14159;
        pi = 4;

        System.out.println(pi);
    }
}
