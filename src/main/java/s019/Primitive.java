package s019;

public class Primitive {
    public static void main(String[] args) {
        boolean flag = false;
        //i booleani vanno definiti come false e true
        //se volessi usare 0 o 1 dovrei convertirlo in booleano
        System.out.println(flag);

        char c = 'A';
        System.out.println(c);

        byte y = 42;
        System.out.println(y);

        short x = 12_000; 
        //l'underscore _ si può mettere per rendere il numero più leggibile
        //la macchina non lo vede, è solo per gli umani per aiutare la leggibilità
        //sta a noi usarlo correttamente
        System.out.println(x);

        int i = 1_000_000_000;
        System.out.println(i);

        //int z0 = 1_000_000_000_000_000;
        //da errore perchè è troppo grande per un int, non ho abbastanza spazio nei 32 bit dell'int per salvare tutti i bit necessari a scriverlo
        //long z = 1_000_000_000_000_000	;	
        // da errore perchè ho dichiarato long ma non ho messo la L
        long z = 1_000_000_000_000_000L; //L perchè è long
        System.out.println(z);

        float f = 3.12e20F; //se non metto la F lo vede come double quando io ho dichiarato float e da errore
        System.out.println(f);

        double d = 3.12e200;
        System.out.println(d);
        
        double nan = Double.NaN;
        double posInf = Double.POSITIVE_INFINITY;
        double negInf = Double.NEGATIVE_INFINITY;
        
        if(!Double.isNaN(nan) || !Double.isInfinite(posInf) || Double.isFinite(negInf)) {
            System.out.println("Unexpected");
        }
    }
}
