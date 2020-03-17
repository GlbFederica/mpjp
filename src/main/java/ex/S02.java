package ex;


public class S02 {
	/**
	 * Average speed
	 * 
	 * @param distance in meters
	 * @param time     in seconds
	 * @return speed in meters per second
	 */
	public static double speed(double distance, double time) {
		
		double s = distance/time;
		
		return s;
	}

	/**
	 * Distance between (x0, y0) and (x1, y1)
	 * 
	 * @param x0 first point x
	 * @param y0 first point y
	 * @param x1 second point x
	 * @param y1 second point y
	 * @return distance
	 */
	public static double distance(int x0, int y0, int x1, int y1) {
	
//		double d = Math.sqrt(Math.pow((x0 - x1), 2) + Math.pow((y0 - y1), 2)); 
//		
//		return d;
		
		return Math.sqrt(Math.pow((x0 - x1), 2) + Math.pow((y0 - y1), 2));
		//in questo modo condenso tutto in una riga senza variabili di appoggio
	}

	/**
	 * Engine capacity
	 * 
	 * @param bore   in mm
	 * @param stroke in mm
	 * @param nr     number of cylinders
	 * @return the engine capacity in cm^3
	 */
	public static double engineCapacity(double bore, double stroke, int nr) {
		
		double cu = Math.PI * Math.pow((bore/(10*2)), 2) * (stroke/10);
		double c = cu * nr;
				
		return c;
	}

	/**
	 * Add up all the digits in an integer
	 * 
	 * @param value
	 * @return sum of digits
	 */
	public static int digitSum(int value) {
		
		int n = Math.abs(value);
		int sum = 0;
			
		while (n != 0) {
			
			sum += n%10;
			n /= 10;
		}
		
		return sum;
	}

	/**
	 * Score based on distance from (0, 0) [1, 5, 10] -> [10, 5, 1, 0]
	 *
	 * @param x
	 * @param y
	 *
	 * @return
	 */
	public static int score(double x, double y) {
		
		int s = 0;
		
		double d = Math.sqrt(Math.pow(x, 2) + Math.pow(y, 2));
		
		if (d>0 && d<=1) {
			s = 10;
		} else if (d>1 && d<=5) {
			s = 5;
		} else if (d>5 && d<=10) {
			s = 1;
		}
		
		//si poteva anche mettere return n all'interno di ogni if in base al valore di interesse
		
		return s;
	}
}
