package de.rode.muenzenumrechnung;

import java.util.Scanner;

public class muenzen {

	public static void main(String[] args) {

		Scanner einleser = new Scanner(System.in);

		double nutzereingabe = 0;
		System.out.println("Bitte gebe mir einen Betrag an z.b. 12,66");
		nutzereingabe = einleser.nextDouble();

		System.out.println(CoinMachine.Teiler(nutzereingabe));

		einleser.close();
	}

}
