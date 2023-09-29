package de.rode.vereerbung.schulverwaltungssoftware;

public class Menschen {
	int alter;
	int iq;
	String geschlecht;
	String gesinnung;
	String name;

	public Menschen(int alter, int iq, String geschlecht, String gesinnung, String name) {
		this.alter = alter;
		this.iq = iq;
		this.geschlecht = geschlecht;
		this.gesinnung = gesinnung;
		this.name = name;
	}

	public int getAlter() {
		return this.alter;
	}

	public void setAlter(int alter) {
		this.alter = alter;
	}

	public int getIq() {
		return this.iq;
	}

	public void setIq(int iq) {
		this.iq = iq;
	}

	public String getGeschlecht() {
		return this.geschlecht;
	}

	public void setGeschlecht(String geschlecht) {
		this.geschlecht = geschlecht;
	}

	public String getGesinnung() {
		return this.gesinnung;
	}

	public void setGesinnung(String gesinnung) {
		this.gesinnung = gesinnung;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "Menschen [alter=" + alter + ", iq=" + iq + ", geschlecht=" + geschlecht + ", gesinnung=" + gesinnung
				+ ", name=" + name + "]";
	}

}
