package de.rode.bergezeichnen;

import java.util.Arrays;

public class berge {
	public static void printMountain(int[] altitudes) {
		int maxAltitude = Arrays.stream(altitudes).max().orElse(0);

		for (int height = maxAltitude; height > 0; height--) {
			StringBuilder line = new StringBuilder();
			for (int altitude : altitudes) {
				if (altitude >= height) {
					line.append("*");
				} else {
					line.append(" ");
				}
			}
			System.out.println(line.toString());
		}}

	    public static void printHollowMountain(int[] altitudes) {
	        int maxAltitude = Arrays.stream(altitudes).max().orElse(0);

	        for (int height = maxAltitude; height >= 0; height--) {
	            StringBuilder line = new StringBuilder();
	            for (int i = 0; i < altitudes.length; i++) {
	                int altitude = altitudes[i];
	                if (altitude >= height) {
	                    line.append("*");
	                } else {
	                    if ((i > 0 && altitudes[i - 1] >= height) || (i < altitudes.length - 1 && altitudes[i + 1] >= height)) {
	                        line.append(" ");
	                    } else {
	                        line.append("*");
	                    }
	                }
	            }
	            System.out.println(line.toString());
	        }
	    }

	public static void main(String[] args) {
		int[] altitudes = { 0, 1, 1, 2, 2, 3, 3, 3, 4, 5, 4, 3, 2, 2, 1, 0 };
		int[] altitudes2 = { 0, 1, 1, 2, 2, 3, 3, 3, 4, 5, 4, 3, 2, 2, 1, 0 };
		printMountain(altitudes);
		printHollowMountain(altitudes2);
	}
}