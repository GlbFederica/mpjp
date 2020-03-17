package s032;

public class For {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Begin block loop " + i);

            if (i == 2) {
                continue; // interrompe il loop for per questo valore dell'indice, si torna all'inizio del for per i=3
            }

            System.out.println("End block loop " + i);
        }
    }
}
