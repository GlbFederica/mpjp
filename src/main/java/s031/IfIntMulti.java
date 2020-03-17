package s031;

public class IfIntMulti {
	public static void main(String[] args) {
		// analogo a SwitchIntMulti, ma con if else
        int value = 5;

        // ...

//        switch (value) {
//        case 1:
//        case 3:
//        case 5:
        	if (value > 0 && value < 7 && value%2 != 0) //0<x<7 dispari
            System.out.println("value is odd and lower than 7");
//            break;
//        case 2:
//        case 4:
//        case 6:
        else if (value > 0 && value < 7 && value%2 == 0) //0<x<7 pari
            System.out.println("value is even and lower than 7");
//            break;
//        default:
        else
			System.out.println("value is something else");
//            break;
//			}
        }
}
