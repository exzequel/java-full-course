public class L24_Printf {
    public static void main(String[] args) {
        // printf() = optional method to control, format, and display text to the console window
        // accepts two arguments - format string + object/variable/value
        // % [flags] [precision] [width] [conversion-character]

        boolean myBoolean = true;
        char myChar = '@';
        String myString = "Bro";
        int myInt = 50;
        double myDouble = 1000;

        // [conversion-character]
        // System.out.printf("%b", myBoolean);
        // System.out.printf("%c", myChar);
        // System.out.printf("%s", myString);
        // System.out.printf("%d", myInt);
        // System.out.printf("%f", myDouble);

        // [width]
        // minimun number of characters to be written as output
        // System.out.printf("Hello %10s", myString);

        // [precision]
        // sets number of digits of precision when outputting floating point numbers
        // System.out.printf("You are this rich: %.2f", myDouble);

        // [flags]
        // adds an effect to output based on the flag added to format specifier
        // - : left-justiyf
        // + : output a plus (+) or minus (-) sign for numeric value
        // 0 : numeric values are zero-padded
        // , : comma grouping separator if numbers > 1000

        System.out.printf("You are this rich: %,f", myDouble);

        // System.out.printf("%d This is a format string ", 123);
    }
}
