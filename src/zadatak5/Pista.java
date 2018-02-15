package zadatak5;

import java.util.*;

public class Pista {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite brzinu aviona: ");
		double brzina = input.nextDouble();
		System.out.print("Unesite ubrzanje aviona: ");
		double ubrzanje = input.nextDouble();
		System.out.println("Minimalna duzina piste mora biti " + ((brzina*brzina)/(2*ubrzanje) + " metara."));
		input.close();
	}
}
