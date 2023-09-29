package de.rode.kurzelebenderpunkte;

import java.awt.Point;

public class testpunkte {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Point p, q, r;
		p = new Point();
		q = p;
		Point s = new Point();
		p = new Point();
		s = new Point();
		// Wie viele Objekte bleiben übrig?
		
//		In diesem Codeausschnitt werden Point-Objekte erstellt und Referenzen auf sie zugewiesen. Lassen Sie uns Schritt für Schritt analysieren, wie viele Objekte am Ende übrig bleiben:
//
//			1. `Point p, q, r;`: Hier werden drei Referenzen `p`, `q` und `r` für Point-Objekte deklariert.
//
//			2. `p = new Point();`: Ein neues Point-Objekt wird erstellt, und die Referenz `p` zeigt nun auf dieses Objekt.
//
//			3. `q = p;`: Die Referenz `q` wird auf dasselbe Point-Objekt umgeleitet, auf das `p` zeigt. Es gibt immer noch nur ein Objekt.
//
//			4. `Point s = new Point();`: Es wird ein weiteres neues Point-Objekt erstellt, und die Referenz `s` zeigt darauf.
//
//			5. `p = new Point();`: Ein neues Point-Objekt wird erstellt, und die Referenz `p` zeigt jetzt auf dieses neue Objekt. Das vorherige Objekt, auf das `p` ursprünglich zeigte, wird nicht mehr referenziert, aber es gibt immer noch ein Objekt (über `q`).
//
//			6. `s = new Point();`: Ein weiteres neues Point-Objekt wird erstellt, und die Referenz `s` zeigt jetzt auf dieses neue Objekt. Das vorherige Objekt, auf das `s` ursprünglich zeigte, wird nicht mehr referenziert, aber es gibt immer noch ein Objekt (über `q`).
//
//			Am Ende bleiben 3 Point-Objekte übrig, eins, auf das `p` und `q` zeigen (das gleiche), und zwei weitere, auf die `s` zeigt (eins davon ist das gleiche wie zuvor). Die Objekte, auf die `p` und `s` ursprünglich zeigten, werden nicht mehr referenziert und können vom Garbage Collector bereinigt werden.

	}

}
