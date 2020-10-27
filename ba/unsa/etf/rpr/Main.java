package ba.unsa.etf.rpr;

import java.util.Scanner;  // Import the Scanner class

public class Main {
	public static void main (String[] args) {
		System.out.println("Unesite prvi broj: ");
		Scanner in = new Scanner(System.in);
		int prvi = in.nextInt();
		System.out.println("Unesite drugi broj: ");
		Scanner in2 = new Scanner(System.in);
		int drugi = in2.nextInt();
		System.out.println("Prvi broj je " + prvi + ", a drugi broj je " + drugi);
	}
}
