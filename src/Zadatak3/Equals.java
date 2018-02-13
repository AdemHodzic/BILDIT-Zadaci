package Zadatak3;


public class Equals {

	public static void main(String[] args) {
	}

	public static boolean equals(int[ ] niz1, int[ ] niz2) {
		if(niz1.length != niz2.length) return false;
		for(int i = 0;i<niz1.length;i++) {
			if(niz1[i]!=niz2[i]) return false;
		}
		
		return true;
	}
}
