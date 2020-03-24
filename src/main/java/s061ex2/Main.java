package s061ex2;

public class Main {
	public static void main(String[] args) {
	
		Pet[] pets = new Pet[2];
		pets[0] = new Cat(1, "Tom");
		pets[1] = new Dog(3, "Bob");
		
		 
		int total = 0;
		for(Pet pet : pets) {
			total += pet.housing();			
		}
		System.out.println("Total housing = " + total);
		
	}

}
