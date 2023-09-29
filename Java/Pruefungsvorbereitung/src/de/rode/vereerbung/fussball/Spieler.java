package de.rode.vereerbung.fussball;

public class Spieler {
	int verteidigung;
	int angriff;
	int durchhaltevermoegen;

	public Spieler(int verteidigung, int angriff, int durchhaltevermoegen) {
		this.verteidigung = 10 + verteidigung;
		this.angriff = 10 + angriff;
		this.durchhaltevermoegen = 10 + durchhaltevermoegen;
	}
	
	public void training(int verteidigung, int angriff, int durchhaltevermoegen) {
		this.verteidigung = this.getVerteidigung() + verteidigung;
		this.verteidigung = this.getAngriff() + angriff;
		this.verteidigung = this.getDurchhaltevermoegen() + durchhaltevermoegen;
	}
	

	public int getVerteidigung() {
		return this.verteidigung;
	}

	public void setVerteidigung(int verteidigung) {
		this.verteidigung = verteidigung;
	}

	public int getAngriff() {
		return this.angriff;
	}

	public void setAngriff(int angriff) {
		this.angriff = angriff;
	}

	public int getDurchhaltevermoegen() {
		return this.durchhaltevermoegen;
	}

	public void setDurchhaltevermoegen(int durchhaltevermoegen) {
		this.durchhaltevermoegen = durchhaltevermoegen;
	}

}
