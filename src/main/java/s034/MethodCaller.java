package s034;

public class MethodCaller {
	public static void main(String[] args) {
		System.out.println(Simple.h());
		// posso farlo perché il metodo è statico, quindi funziona anche se non ho
		// ancora oggetti di classe simple
		
		Simple reference = new Simple();
		//al posto di reference potevo chiamarla in qualsiasi altro modo

		int result = reference.f(7, 6);
		//il punto è chiamato operatore di dereferencing (dereferenziazione)
		System.out.println(result);

		reference.g(true);
		reference.g(false);
	}
}
