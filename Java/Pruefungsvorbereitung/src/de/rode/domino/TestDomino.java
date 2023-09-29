/**
 * Diese Klasse repräsentiert ein Programm zur Überprüfung, ob zwei Zeichenketten gemeinsame Ziffern enthalten.
 * Autor: Rode
 * Erstellungsdatum: 28.09.2023
 */
package de.rode.domino;

import java.util.Scanner;

public class TestDomino {

    /**
     * Die Hauptmethode des Programms.
     *
     * @param args Die Befehlszeilenargumente (werden in diesem Programm nicht verwendet).
     */
    public static void main(String[] args) {
        Scanner einleser = new Scanner(System.in);
        String dominozahl1 = "";
        String dominozahl2 = "";

        System.out.println("Bitte geben Sie mir Ihre erste Zahl: ");
        dominozahl1 = einleser.next();
        System.out.println("Bitte geben Sie mir Ihre zweite Zahl: ");
        dominozahl2 = einleser.next();
        System.out.println(zahlenpruefung(dominozahl1, dominozahl2));

        einleser.close();
    }

    /**
     * Diese Methode prüft, ob zwei Zeichenketten gemeinsame Ziffern haben.
     *
     * @param a Die erste Eingabezeichenkette.
     * @param b Die zweite Eingabezeichenkette.
     * @return True, wenn gemeinsame Ziffern vorhanden sind, andernfalls false.
     */
    public static boolean zahlenpruefung(String a, String b) {
        boolean hatGemeinsameZiffer = false;

        // Die Eingabezeichenketten in Integer-Werte umwandeln.
        int eingabea = Integer.parseInt(a);
        int eingabeb = Integer.parseInt(b);

        // Überprüfen, ob die eingegebenen Zahlen größer als 99 sind und ggf. die ersten beiden Ziffern entfernen.
        if (eingabea > 99) {
            a = Integer.toString(eingabea % 100);
        }
        if (eingabeb > 99) {
            b = Integer.toString(eingabeb % 100);
        }

        // Vergleiche die Ziffern beider Zeichenketten, um gemeinsame Ziffern zu finden.
        for (int i = 0; i < a.length(); i++) {
            for (int j = 0; j < b.length(); j++) {
                if ((int) a.charAt(i) == (int) b.charAt(j)) {
                    hatGemeinsameZiffer = true;
                }
            }
        }

        // True zurückgeben, wenn gemeinsame Ziffern gefunden wurden, andernfalls false zurückgeben.
        return hatGemeinsameZiffer;
    }
}
