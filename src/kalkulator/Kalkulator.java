package kalkulator;

import java.util.*;

public class Kalkulator {

	public static void main(String[] args) {

	Scanner input = new Scanner(System.in);
	System.out.println("Pozdrav.Broj pa operaciju koju zellite uraditi pa sljedeci broj.\nUnesite -1 za prekid");
	System.out.println("1.Sabiranje"
			+"\n2.Oduzimanje"
			+"\n3.Mnozenje"
			+"\n4.Djeljenje"
			+"\n5.Korijenovanje(treci argument nece uticati na operaciju)"
			+"\n6.Kvadriranje(treci argument nece uticati na operaciju) ");
	int a = input.nextInt();
	error(a);
	int b = input.nextInt();
	error(b);
	int operacija = input.nextInt();
	error(operacija);
	System.out.println("Vas rezultat je " + izracunaj(a,operacija,b));
	System.out.println("Hvala vam na koristenju nase aplikacije");
	input.close();
	}
	
	public static void error(int a){
		if(a<0) pogresanUnos();
	}
	
	public static int izracunaj(int a,int b,int oper){
		switch(oper){
			case 1:
				return sabiranje(a,b);
				
			case 2:
				return oduzimanje(a,b);
			case 3:
				return mnozenje(a,b);
			case 4:
				return dijeljenje(a,b);
			case 5:
				return (int)korjenovanje(a);
			case 6:
				return kvadriranje(a);
			default:
				pogresanUnos();
		}
		return -1;
	}
	public static void pogresanUnos(){
		System.out.println("Pogresan unos");
		System.exit(0);
		}
	
	public static int sabiranje (int a, int b){
		return a+b;
	}
	public static int oduzimanje (int a, int b){
		return a-b;
	}
	public static int mnozenje (int a, int b){
		return a*b;
	}
	public static int dijeljenje(int a, int b){
		return a/b;
	}
	public static double korjenovanje(int a){
		return Math.sqrt(a);
	}
	public static int kvadriranje(int a){
		return a*a;
		}
}
