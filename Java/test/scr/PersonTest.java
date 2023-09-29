package de.bundeswehr.auf.oop.test;

public class PersonTest {

	public static void main(String[] args) {
		Ort[] orte = { new Ort("82343", "Pöcking"), new Ort("82340", "Feldafing") };
//		orte[0] = new Ort("82343", "Pöcking");
		Person dominik = new Person("Dominik", "Wente", new Beruf("Soldat"), new Adresse("Maxhofstr.", "1", orte[0]));
		System.out.println(dominik.getAdresse());
		System.out.println(dominik);
//		dominik.werdeArbeitslos();
//		System.out.println(dominik);
		Adresse adressePoecking = new Adresse(dominik.getAdresse().getStrasse(), dominik.getAdresse().getHausnummer(), dominik.getAdresse().getOrt());
		Adresse dominiksAdresse = dominik.getAdresse();
		dominiksAdresse.setStrasse("Tutzinger Str.");
		dominik.getAdresse().setHausnummer("46");
		System.out.println(dominik);
//		orte[1] = new Ort("82340", "Feldafing");
		dominik.getAdresse().setOrt(orte[1]);
		System.out.println(dominik);
		Person frank = new Person("Frank", "Rieger", dominik.getBeruf(), adressePoecking);
		
//		dominik.setBeruf(frank.getBeruf());
//		dominik.werdeArbeitslos();
//		System.out.println(dominik);
		
		System.out.println(frank);
		System.out.println("Ist Frank gleich Dominik? " + frank.equals(dominik));
		System.out.println("Hat Frank den gleichen Beruf wie Dominik? " + frank.getBeruf().equals(dominik.getBeruf()));
		
	}

}
