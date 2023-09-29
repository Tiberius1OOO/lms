package de.rode.vereerbung.schulverwaltungssoftware;

public class Lehrer extends Menschen {

	double gehalt;
	String hauptfach;

	public Lehrer(double gehalt, String hauptfach, int alter, int iq, String geschlecht, String gesinnung, String name) {
		super(alter, iq, geschlecht, gesinnung, name);
		this.gehalt = gehalt;
		this.hauptfach = hauptfach;

	}

	public double getGehalt() {
		return this.gehalt;
	}

	public void setGehalt(double gehalt) {
		this.gehalt = gehalt;
	}

	public String getHauptfach() {
		return this.hauptfach;
	}

	public void setHauptfach(String hauptfach) {
		this.hauptfach = hauptfach;
	}

	@Override
	public String toString() {
		return "Lehrer [gehalt=" + gehalt + ", hauptfach=" + hauptfach + "]" + super.toString();
	}

}
