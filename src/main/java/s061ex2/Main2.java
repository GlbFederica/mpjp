package s061ex2;

public class Main2 {
	public static void main(String[] args) {
	
		Pet2[] pets = new Pet2[2];
		pets[0] = new Cat2(1, "Tom");
		pets[1] = new Dog2(3, "Bob");
		
		 
		int total = 0;
		for(Pet2 pet : pets) {
			total += pet.housing();			
		}
		System.out.println("Total housing = " + total);
		
	}

}
