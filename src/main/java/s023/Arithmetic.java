package s023;

public class Arithmetic {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println(a + b); // 13
        System.out.println(a - b); // 7
        System.out.println(a * b); // 30
        System.out.println(a / b); // 3
        System.out.println(a % b); // 1

        // System.out.println(a / 0); // ArithmeticException

        double c = 3.0;

        System.out.println(a + c); // 13.0
        System.out.println(a / c); // 3.3333333333333335
        System.out.println(a % c); // 1.0

        System.out.println(c - 2.1); // 0.8999999999999999
        //questo perchè i numeri sono scritti come 1 mantissa ed esponente
        //e sono però salvati non in base decimale come li scrivo io, ma in base 2 (in binario)
        //quindi se io scrivo 2.1 non ho in memoria esattamente 2.1 ma una sua approssimazione derivante 
        //dal fatto che è scritto in binario --> risultato non preciso
        System.out.println(c / 0); // Infinity
    }
}
