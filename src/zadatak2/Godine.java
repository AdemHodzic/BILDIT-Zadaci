package zadatak2;

import java.util.*;

public class Godine {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite pocetnu godinu: ");
		int pocetak = input.nextInt();
		System.out.print("Unesite krajnu godinu: ");
		int kraj = input.nextInt();
		System.out.println("Prijestupne godine su: ");
		int counter = 0;
		for(int i = pocetak;i<=kraj;i++) {
			if(i%4==0) {
				System.out.print(i + " ");
				counter++;
			}
			if(counter==10) {
				System.out.println();
				counter = 0;
			}
		}
		input.close();
	}
}
