package s036;

public class Main {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[10]; //creo un array di 10 oggetti della classe dog, che saranno tutti inizializzati a null

        for (int i = 0; i < dogs.length; i++) {
            dogs[i] = new Dog(); //inizializzo ogni elemento del mio array usando il costruttore della classe dog
        }

        dogs[5].bark();
    }
}
