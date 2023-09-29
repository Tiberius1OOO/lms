package de.rode.vereerbung.punkte;

public class Punkt3D extends Punkt2D {

	/** Position in der Z-Achse */
	public int zKoord;

	/**
	 * Stellt einen Punkt in einem zweidimensionalen System dar.
	 *
	 * @param xKoord Position in der X-Achse
	 * @param yKoord Position in der Y-Achse
	 * @param zKoord Position in der z-Achse
	 */
	public Punkt3D(int xKoord, int yKoord, int zKoord) {
		super(xKoord, yKoord);
		this.zKoord = zKoord;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + xKoord;
		result = prime * result + yKoord;
		result = prime * result + zKoord;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof Punkt3D)) {
			return false;
		}
		Punkt3D other = (Punkt3D) obj;
		if (xKoord != other.xKoord) {
			return false;
		}
		if (yKoord != other.yKoord) {
			return false;
		}
		if (zKoord != other.zKoord) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "Punkt3D X= " + this.xKoord + ", Y= " + this.yKoord + ", Z=" + this.zKoord + "\n" + hashCode();
	}

}