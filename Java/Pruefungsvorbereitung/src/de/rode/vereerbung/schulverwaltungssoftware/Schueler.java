package de.rode.vereerbung.schulverwaltungssoftware;

public class Schueler extends Menschen {
	int klassenstufe;
	int beitragsfaktor;
	boolean klassensprecher;
	double beitrag;

	public Schueler(int klassenstufe, int beitragsfaktor, boolean klassensprecher, int alter, int iq,
			String geschlecht, String gesinnung, String name) {
		super(alter, iq, geschlecht, gesinnung, name);
		this.klassenstufe = klassenstufe;
		this.beitragsfaktor = beitragsfaktor;
		this.klassensprecher = klassensprecher;
		this.beitrag = (alter/klassenstufe)*beitragsfaktor;
	}

	public int getKlassenstufe() {
		return this.klassenstufe;
	}

	public void setKlassenstufe(int klassenstufe) {
		this.klassenstufe = klassenstufe;
	}

	public int getBeitragsfaktor() {
		return this.beitragsfaktor;
	}

	public void setBeitragsfaktor(int beitragsfaktor) {
		this.beitragsfaktor = beitragsfaktor;
	}

	public boolean isKlassensprecher() {
		return this.klassensprecher;
	}

	public void setKlassensprecher(boolean klassensprecher) {
		this.klassensprecher = klassensprecher;
	}

	public double getBeitrag() {
		return this.beitrag;
	}

	public void setBeitrag(double beitrag) {
		this.beitrag = beitrag;
	}

	@Override
	public String toString() {
		return "Schueler [klassenstufe=" + klassenstufe + ", beitragsfaktor=" + beitragsfaktor + ", klassensprecher="
				+ klassensprecher + ", beitrag=" + beitrag + super.toString();
	}

}
