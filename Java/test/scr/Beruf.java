package de.bundeswehr.auf.oop.test;

public class Beruf {
	
	private String bezeichnung;

	public Beruf(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	public String getBezeichnung() {
		return bezeichnung;
	}

	public void setBezeichnung(String bezeichnung) {
		this.bezeichnung = bezeichnung;
	}

	@Override
	public String toString() {
		return "Beruf [bezeichnung=" + bezeichnung + "]";
	}

}
