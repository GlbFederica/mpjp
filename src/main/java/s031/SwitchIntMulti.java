package s031;

public class SwitchIntMulti {
	public static void main(String[] args) {
		int value = 3;

		// ...

		switch (value) {
		case 1:
		case 3:
		case 5:
			System.out.println("value is odd and lower than 7");
			break;
		case 2:
		case 4:
		case 6:
			System.out.println("value is even and lower than 7");
			break;
		default:
			System.out.println("value is something else");
			break;
		}
	}
}
