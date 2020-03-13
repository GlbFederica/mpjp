package s018;

public class Variable {
    public static void main(String[] args) {
        int value;
        String name = "Bob";

        value = 42;
        
        System.out.println(name);
        System.out.println(value);

        // Dangerous! Beware of null!
        //il null è una sorta di reference non reference
        //ho una stringa ma non so ancora cosa ci va dentro, quindi sto dicenfo a java
        //di crearmi solo la variabile nello stack ma senza metterci dentro una reference, ma mettendoci null
        //in questo modo sto tenendo lo spazio per una reference ma senza mettere nulla in questo spazio
        //sto creano solo la parte nello stack e non nello heap
        String noName = null;
        System.out.println(noName);
        
        // Java 10 inferred type
        var bValue = 42;
        var bName = "Tom";

        System.out.println(bName);
        System.out.println(bValue);
    }
}
