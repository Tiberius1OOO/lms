package morningleassion;

import java.util.Scanner;

public class morningshit {

	public static void main(String[] args) {

		Scanner einleser = new Scanner(System.in);
		String nameeins = "";
		String namezwei = "";
		double gewichteins = 0;
		double gewichtzwei = 0;


		
	
		System.out.println("Bitte geben sie einen namen ein: ");
		nameeins = einleser.next();
		System.out.println("Bitte geben sie einen zweiten namen ein: ");
		namezwei = einleser.next();
		System.out.println("Bitte nennen sie mir das gewicht des ersten namens:");
		gewichteins = einleser.nextDouble();
		System.out.println("Bitte nennen sie mir das gewicht des zweiten namens:");
		gewichtzwei = einleser.nextDouble();
		System.out.printf("%-40s |%6.2f Kg %n%-40s |%6.2f Kg ", nameeins + "hat ein Gewicht von:",
				gewichteins, namezwei + "hat ein Gewicht von: ", gewichtzwei);
		
		einleser.close();
		
	}

}
