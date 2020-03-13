package s027;

public class Concatenation {
    public static void main(String[] args) {
        System.out.println("Resistence" + " is " + "useless");
        System.out.println("Solution: " + "42");
        System.out.println("Solution: " + 42);
        System.out.println("Solution: " + (42+3) );
        System.out.println("Solution: " + "(42+3)" );
        //se ho una stringa concatenata a un altro tipo, questo viene trasformato in stringa direttamente
        System.out.println(true + " or " + false);

        System.out.println("Vogons".repeat(3)); // Java 11
   }
}
