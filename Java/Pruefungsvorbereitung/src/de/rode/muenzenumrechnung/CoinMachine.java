package de.rode.muenzenumrechnung;

public class CoinMachine {

	public static String Teiler(double betrag) {
		String ausgabe = "\n";
		betrag = betrag * 100;
		ausgabe = ausgabe + (int) betrag / 200 + " x 2 €\n";
		betrag = betrag - (((int)betrag / 200)*200);
		ausgabe = ausgabe + (int) betrag / 100 + " x 1 €\n";
		betrag = betrag - (((int)betrag / 100)*100);
		ausgabe = ausgabe + (int) betrag / 50 + " x 50 Cent\n";
		betrag = betrag - (((int)betrag / 50)*50);
		ausgabe = ausgabe + (int) betrag / 20 + " x 20 Cent\n";
		betrag = betrag - (((int)betrag / 20)*20);
		ausgabe = ausgabe + (int) betrag / 10 + " x 10 Cent\n";
		betrag = betrag - (((int)betrag / 10)*10);
		ausgabe = ausgabe + (int) betrag / 5 + " x 5 Cent\n";
		betrag = betrag - (((int)betrag / 5)*5);
		ausgabe = ausgabe + (int) betrag / 2 + " x 2 Cent\n";
		betrag = betrag - (((int)betrag / 2)*2);
		ausgabe = ausgabe + (int) betrag + " x 1 Cent\n";
		return ausgabe;
	}
}
