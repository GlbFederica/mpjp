package s019;

public class Byte {
    public static void main(String[] args) {
               
        int n = 0b110;
        System.out.println(n);
        byte nb = (byte) n;
        System.out.println(nb);
        
        int n1 = 0b11110100001001000000;
        System.out.println("n1 " + n1);
        byte n1b = (byte) n1; //tiene solo gli ultimi 8 bit 01000000 
        System.out.println("n1b " + n1b);
        int n2 = 0b01000000;
        System.out.println("n2 " + n2);
        int n2b = (byte) n2; //avevo già solo 8 bit e li tiene tutti, il primo è il segno e gli altri 7 il numero
        System.out.println("n2b " + n2b);
        int n3 = 0b11000000; //rispetto a n2 sto dando un numero diverso
        System.out.println("n3 " + n3);
        byte n3b = (byte) n3; //analogo a n2 ma cambiato di segno in quanto cambia il primo bit che da 0 passa a 1
        System.out.println("n3b " + n3b);
        int n4 = 0b111000000; //aggiungo un 1, diventano quindi 9 bit
        System.out.println("n4 " + n4);
        byte n4b = (byte) n4;
        System.out.println("n4b " + n4b);
        
        int n5 = 0b0101000; //7 bit che identificano il numero 40
        System.out.println("n5 " + n5);
        byte n5b = (byte) n5;
        System.out.println("n5b " + n5b);
        int n6 = 0b00101000; //uguale a n5 ma con un ottavo bit a sx uguale a 0 che indica il segno
        System.out.println("n6 " + n6);
        byte n6b = (byte) n6;
        System.out.println("n6b " + n6b);
        int n7 = 0b10101000; //uguale a n6 ma con l'ottavo bit messo come 1 e non 0
        //-> essendo int l'ottavo bit è significativo per definire il numero -> non è più 40 ma 168
        System.out.println("n7 " + n7);
        byte n7b = (byte) n7;
        System.out.println("n7b " + n7b);
        byte n7bb = 0b0101010; //numero in byte con 7 bit
        System.out.println("n7bb " + n7bb);
        byte n8bb = 0b00101010; //numero in byte con 8 bit, bit del segno vale 0
        System.out.println("n8bb " + n8bb);
        //byte n9bb = 0b10101010; //numero in byte con 8 valori, bit del segno vale 1 -> da errore perchè byte non ha il segno
        //System.out.println("n9bb " + n9bb);
        int n10 = 0b10101010; //numero con 8 valori, è un numero, è uguale a n8bb ma con il bit a sx uguale a 1
        System.out.println("n10 " + n10);
        byte n10b = (byte) n10; //ottengo -86
        System.out.println("n10b " + n10b);
        byte n10bpiu = 0b1010110;
        System.out.println("n10b positivo " + n10bpiu);
        // Per rappresentare l'opposto di un numero binario in complemento se ne invertono, o negano, i singoli bit: 
        //si applica cioè l'operazione logica NOT. Si aggiunge infine 1 al valore del numero trovato con questa operazione.
        //questo è quello che fa java leggendo i byte, considerando sempre tutti gli 8 bit del byte
        // 00 10 10 10 è il numero 42, per avere -42 diventa 11 01 01 10
        byte a1 = 0b00101010;
        System.out.println("a1 " + a1);
        byte a2 = (byte) 0b11010110;
        System.out.println("a2 " + a2);
        byte a3 = 0b01000000;
        System.out.println("a3 " + a3);
        byte a4 = (byte) 0b10000000;
        System.out.println("a4 " + a4);
        
        int num = 128;
        byte numb = (byte) num;
        System.out.println("num " + num + " numb " + numb);
                
        byte nm7 = 0b1111111;
        System.out.println("nm7 " + nm7);
        byte nm8 = (byte) 0b10000000;
        System.out.println("nm8 " + nm8);
        
        //in byte posso rappresentare 2^8 numeri (da -128 a 127), ovvero 2*2^7=2^7 negativi + 2^7 positivi
    }
}
