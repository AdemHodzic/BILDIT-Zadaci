package Zadatak2;

public class Karte {

	public static void main(String[] args) {
		char broj[] = new char[13];
		String znak[] = new String[4];
		for(int i = 1;i<10;i++) {
			broj[i] = Integer.toString(i).charAt(0);
		}
		broj[0] = 'A';
		broj[10] = 'J';
		broj[11] = 'Q';
		broj[12] = 'K';
		
		znak[0] = "Srce";
		znak[1] = "Pik";
		znak[2] = "Djetelina";
		znak[3] = "Kocka";
		
		System.out.println("Karta koju ste izvukli je " + broj[((int)(Math.random()*13))] + " u znaku " + znak[((int)(Math.random()*4))]);
	}

}
