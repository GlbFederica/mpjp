package ex;

import java.util.Arrays;
import java.util.Scanner;

public class SinkThem {
	static public final char SHIP = 'S';
	static public final char WRECK = 'W';
	static public final char MISS = 'M';
	static public final char EMPTY = '_';
	static public final char UNKNOWN = '?'; // lo uso per stampare, non voglio stampare la posizione delle barche e di
											// empty -> stampo W,M e ? al posto di _ e S
	// final --> vuol dire che sono costanti, sono caratteri che rappresentano
	// quello che metto sul mio board

	static public final int POINTS_FOR_SINK = 5;
	static public final int POINTS_FOR_MISS = 1;

	/** the battlefield */
	private char[][] board;
	/** ships on board */
	private int counter;
	/** current player score */
	private int points;

	/**
	 * Create the squared board game filled with EMPTY cells
	 * 
	 * @param dimension board size
	 */
	public SinkThem(int dimension) {

		board = new char[dimension][dimension];

		for (int i = 0; i < dimension; i++) {
			for (int j = 0; j < dimension; j++) {
				board[i][j] = '_';
			}
		}
	}

	/**
	 * @return the current score
	 */
	public int getPoints() {
		return points;
	}

	/**
	 * @return true if no more ships
	 */
	public boolean done() {
		return counter == 0;
	}

	/**
	 * The board is a square
	 * 
	 * @return board size
	 */
	public int getBoardSize() {
		return board.length;
	}

	/**
	 * A user representation for the board
	 * 
	 * Only MISS and WRECK should be shown
	 * 
	 * UNKWNOWN should hide EMPTY and SHIP
	 * 
	 * @return a string
	 */
	public String getBoard() {

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board.length; j++) {
				if (board[i][j] == '_' || board[i][j] == 'S') {
					sb.append("? ");
				} else {
					sb.append(board[i][j]);
					sb.append(" ");
				}
			}
			sb.append('\n');
		}

		return sb.toString();
	}

	/**
	 * Place a ship on the board
	 * 
	 * @param row
	 * @param col
	 * @return false if it can't be placed - se voglio mettere una barca in una
	 *         posizione già occupata
	 */
	public boolean place(int row, int col) {

		if (board[row][col] == '_') {
			board[row][col] = 'S';
			return true;
		}
		return false;
	}

	/**
	 * Shoot to a cell
	 * 
	 * a miss would cost POINTS_FOR_MISS, a center would give POINTS_FOR_SINK
	 * 
	 * @param row
	 * @param col
	 * @return true for a sink se colpisco un punto he ho già colpito vale come miss
	 */
	public boolean shoot(int row, int col) {

		if (board[row][col] == 'S') {
			board[row][col] = 'W';
			points += POINTS_FOR_SINK;
			return true;
		} else {
			board[row][col] = 'M';
			points -= POINTS_FOR_MISS;
			return false;
		}

	}

	@Override
	public String toString() {
		return Arrays.deepToString(board);
	}

	/**
	 * Apply a simple strategy to the game
	 * 
	 * @param st the game
	 */
	public static void shootAll(SinkThem st) {
		for (int i = 0; i < st.getBoardSize(); i++) {
			for (int j = 0; j < st.getBoardSize(); j++) {
				System.out.println(st.getBoard());
				if (st.shoot(i, j)) {
					System.out.println("Hit!");
					if (st.done()) {
						System.out.println("You win!");
						return;
					}
				} else {
					System.out.println("Miss ...");
				}
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Let's start the game!");

		System.out.println("Enter the dimension of the square board (between 4 and 15): ");

		int dimension = 0;

		do {
			while (!sc.hasNextInt()) {
				System.out.print("Bad input! Insert a number between 4 and 15.");
				sc.next();
			}
			dimension = Integer.parseInt(sc.nextLine());
			if (dimension < 4 || dimension > 15) {
				System.out.println("Bad input! Insert a number between 4 and 15.");
			}
		} while (dimension < 4 || dimension > 15);
		
//		int dimension = sc.nextInt();
//		while (dimension < 4 || dimension > 15) {
//			System.out.println("Bad input. Size accepted only between 5 and 15.");
//			System.out.println("Enter the dimension of the square board:");
//			dimension = sc.nextInt();
//		}

		SinkThem st = new SinkThem(dimension);
		System.out.println(
				"The board is ready, is a " + dimension + " by " + dimension + " square with " + dimension + " ships.");

		for (int i = 0; i < dimension; i++) {
			int a = (int) (Math.random() * dimension);
			int b = (int) (Math.random() * dimension);
			st.place(a, b);
		}

		int counter = dimension;
		System.out.println("Are you ready to shoot?");

		while (counter > 0) {
			System.out.println("Enter the row:");
			int r = Integer.parseInt(sc.nextLine()) -1;					
			System.out.println("Enter the column:");
			int c = Integer.parseInt(sc.nextLine()) -1;
			System.out.println("You are shooting the cell: " + (r + 1) + ", " + (c + 1));
			System.out.println("Press ENTER to shoot");
			sc.nextLine();

			if (st.shoot(r, c)) {
				System.out.println("Hit and sunk!");
				counter -= 1;
			} else {
				System.out.println("Missed!");
			}
			System.out.println("Now you have " + st.getPoints() + " points!");
			System.out.println("\n" + st.getBoard());
		}
		sc.close();
		
		System.out.println("YOU WIN!!");
		System.out.println("You scored " + st.getPoints());
		System.out.println(st);
		
	}
}