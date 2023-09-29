package de.rode.vereerbung.punkte;

public class Punkt2D {

    /** Position in der X-Achse */
    public int xKoord;
    /** Position in der Y-Achse */
    public int yKoord;

    /**
     * Stellt einen Punkt in einem zweidimensionalen System dar.
     *
     * @param xKoord Position in der X-Achse
     * @param yKoord Position in der Y-Achse
     */
    public Punkt2D(int xKoord, int yKoord) {
        this.xKoord = xKoord;
        this.yKoord = yKoord;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + xKoord;
        result = prime * result + yKoord;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Punkt2D)) {
            return false;
        }
        Punkt2D other = (Punkt2D) obj;
        if (xKoord != other.xKoord) {
            return false;
        }
        if (yKoord != other.yKoord) {
            return false;
        }
        return true;
    }
    public String toString() {
		return "Punkt2D X= " + this.xKoord + ", Y= " + this.yKoord + ", hash=" + hashCode();
	}

}
