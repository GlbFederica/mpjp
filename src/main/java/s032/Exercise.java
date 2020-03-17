package s032;

public class Exercise {
    public static void main(String[] args) {
        boolean[] flags = { true, false, false };

        System.out.println("*** Initial Values ***");
        for (boolean flag : flags) {
            System.out.println(flag);
        }

        for (int i = 0; i < flags.length; i++) {
            if (!flags[i]) { //se flags[i] è false
                flags[i] = true;
            }
        }

        System.out.println("*** Changed Values ***");
        for (boolean flag : flags) {
            System.out.println(flag);
        }

        for (boolean flag : flags) {
            if (!flag) {
                flag = true; // lavoro sulla variabile d'appoggio flag -> non cambia l'array al di fuori del ciclo for
            }
        }

        System.out.println("*** (Not!) Changed Values ***");
        for (boolean flag : flags) {
            System.out.println(flag);
        }

    }
}
