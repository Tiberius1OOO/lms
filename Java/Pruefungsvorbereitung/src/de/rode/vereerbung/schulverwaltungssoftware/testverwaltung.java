package de.rode.vereerbung.schulverwaltungssoftware;

public class testverwaltung {

	public static void main(String[] args) {
		
		Lehrer Goethe = new Lehrer(3600, "Mathe", 329, 177, "Genderfluid", "Neutral", "George Goethe");
		Lehrer Stalin = new Lehrer(1600, "Sport", 229, 77, "Männlich", "Evil", "Ivan Stalin");
		Lehrer Salazar = new Lehrer(6600, "Plünderrei", 829, 977, "Pirat", "Neutral Evil", "Gormez Salazar");
		Schueler Frank = new Schueler(5, 5, false , 22, 21, "Männlich", "Neutral", "Frank Maria");
		Schueler Anke = new Schueler(6, 3, true, 32, 121, "Weiblich", "Good", "Anke Richter");
		
		System.out.println(Goethe);
		System.out.println(Stalin);
		System.out.println(Salazar);
		System.out.println(Frank);
		System.out.println(Anke);
		

	}

}
