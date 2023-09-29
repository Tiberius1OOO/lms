/**
 * 
 */
package de.roede.scannerproject;

import java.util.Scanner;

public class ScannerProject {

	public static void main(String[] args) {
		int nutzereingabeint = 0;
		String nutzereingabestring = "";

		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie bitte ihren namen ein: ");
		nutzereingabestring = scanner.next();
		System.out.println("Eine zahl ein: ");
		nutzereingabeint = scanner.nextInt();
		System.out.println("Ihr Name Lautet: " + nutzereingabestring + ".");
		System.out.println("Die zahl Lautet: " + nutzereingabeint + ".");
		scanner.close();
	}
}
