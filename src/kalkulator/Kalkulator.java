package kalkulator;

import java.util.*;

public class Kalkulator {

	public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	System.out.println("Pozdrav.Broj pa operaciju koju zellite uraditi pa sljedeci broj.\nUnesite -1 za prekid");
	int a = input.nextInt();
	error(a);
	int b = input.nextInt();
	error(b);
	int operacija = input.nextInt();
	error(operacija);
	System.out.println("Vas rezultat je " + izracunaj(a,b,operacija));
	System.out.println("Hvala vam na koristenju nase aplikacije");
	input.close();
	}
	
	public static void error(int a){
		if(a<0) System.exit(0);
	}
	
	public static int izracunaj(int a,int b,int oper){
		switch(oper){
			case 1:
				sabiranje(a,b);
				break;
			case 2:
				oduzimanje(a,b);
				break;
			case 3:
				mnozenje(a,b);
				break;
			case 4:
				dijeljenje(a,b);
				break;
			case 5:
				korjenovanje(a,b);
				break;
			case 6:
				kvadriranje(a,b);
				break;
			default:
				System.out.println(pogresanUnos());
				System.exit(0);
		}
	}
	public static String pogresanUnos(){
		return "Pogresan unos";
	}
}
