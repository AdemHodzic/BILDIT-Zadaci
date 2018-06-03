package Zadatak1;

import java.util.*;

public class Stednja {

	public static void main(String[] args) {
		final double index = 1.00417;
		double mojIznos,ukupanIznos=0;
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite iznos koliko cete uplacivati na racun svaki mjesec: ");
		mojIznos = input.nextDouble();
		System.out.println("Unesite za koliko mjeseci zelite da znate  vas iznos: ");
		int mjeseci = input.nextInt();
		for(int i = 0;i<mjeseci;i++) {
			ukupanIznos = (ukupanIznos+mojIznos) * index;
		}
		System.out.println("Vas iznos za " + mjeseci + " mjeseci ce biti " + ukupanIznos);
		input.close();
	}

}
