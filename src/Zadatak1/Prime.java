package Zadatak1;

import java.util.*;

public class Prime {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite pocetni broj: ");
		int pocetak = input.nextInt();
		System.out.println("Unesite krajni broj: ");
		int kraj = input.nextInt();
		printPrimes(pocetak,kraj);
		input.close();
	}
	
	public static void printPrimes(int pocetak, int kraj) {
		System.out.println("Prosti brojevi su: ");
		for(int i = pocetak;i<kraj;i++) {
			if(isPrime(i)) {
				 System.out.print(i + " ");
			}
		}
	}
	
	public static boolean isPrime(int broj) {
		if(broj%2==0) return false;
		for(int i = 3;i*i<broj;i+=2) {
			if(broj%i==0) return false;
		}
		return true;
	}
}
