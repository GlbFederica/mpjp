package s061ex;

public class Consultant extends Person { //estendo la classe Person
    private int daily;//proprietà della classe Consultant

    public Consultant(String firstName, String lastName, int daily) { //costruttore di consultant
        super(firstName, lastName); //rimando al costruttore della classe superiore Person
        this.daily = daily; //inizializzazione della proprietà di questa classe, che non è proprietà del costruttore
    }

    public int getDaily() {
        return daily;
    }
    
    @Override
    public String toString() { //ritorna in formato stringa l'oggetto stesso
        return "Consultant " + super.toString() + ": daily bill is " + daily;
    }
}
