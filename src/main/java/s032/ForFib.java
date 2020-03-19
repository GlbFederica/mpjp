package s032;

public class ForFib {
    public static void main(String[] args) {
		
    	int value = 5;
    	int[][] result = new int[value][value];

		for (int i=0; i<value; i++) {
			for (int j=0; j<value; j++) {
				result[i][j] = (i+1)*(j+1);
				System.out.println(result[i][j]);
			}
		}

    }
}
