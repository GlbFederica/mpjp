package s021;

public class MoreStrings {
    public static void main(String[] args) {
        String s = new String("hello");
        //altro modo per definire una stringa dove è più comprensibile il passaggio
        //che fa in memoria
        //string s --> parte allocata nello stack in cui salvo la reference (new) di
        //String ("Hello") che è invece allocata nell'Heap
        System.out.println(s);
        
        s = "Tom";
        //In questo modo sto cambiando quello che c'è dentro s che è nello stack
        //sostituendo la reference a Hello con la reference a Tom, che sono entrambi salvati nello Heap
        //a questo punto nel mio codice Hello non è più puntato/referenziato da nessuno, rimane memoria utilizzata inutilmente
        //c'è il garbage collector che scandaglia l'Heap per eliminare memoria allocata e non referenziata
        //vantaggioso perchè recupero memoria, svantaggioso perchè occupa risorse durante il suo utilizzo (tempo)
        //Java lo fa correre o se lo chiedo io o se la memoria dello Heap è piena nel momento in cui io sto andando a chiedere di occuparne altra
        //Si può dire nel codice quando farlo andare, ma tipicamente si lascia a Java l'organizzazione dell'utilizzo di garbage
        //Se sto facendo un programma dove i tempi devono essere ben rispettati e ci sono task da risolvere in tempi ben precisi
        //posso nel codice dirgi quando far partire il garabage (esempio codici di gestione per centrali nucleari)
        
        //Se prima di scrivere s="Tom" aggiungo
        //String k = s ->sto creando una variabile k nello stack in cui salvo il puntatore a "Hello" nello Heap
        //in questo modo quando poi sovrascrivo la reference presente in s mantengo nel codice una refrence a k
        
        String t = "hello";
        System.out.println(t);
        
        String x = t; 
        //sto creando nello stack una variabile x al cui interno
        //salvo la stessa cosa che c'è salvata in t 
        //(t è anche lui nello stack e contiene la referene/puntatore alla posizione di "Hello" nell'Heap)
        //quindi in x avrò una reference/puntatore alla posizione di "Hello" in Heap, identica a quello che c'è in t
        
        StringBuilder sb = new StringBuilder("hello");
        System.out.println(sb);
    }
}
