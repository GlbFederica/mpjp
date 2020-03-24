package s061ex2;

public abstract class Pet {
	private int days;
	private String name;
	
	public Pet(int days, String name) {
		this.days = days;	
		this.name = name;
	}
	
	public int getDays() {
		return days;
	}
	
    public String getName() {
        return name;
    }
	
	public abstract int housing();
	
}
