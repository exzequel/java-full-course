package L38_AccessModifiers.Package1;
import L38_AccessModifiers.Package2.*;

public class A {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.publicMessage);
    }
}
