package zadatak1;

import java.util.*;

public class Investment {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite iznos invensticije: ");
		double investment = input.nextDouble();
		System.out.println("Unesite Interesnu stopu: ");
		double interes = input.nextDouble();
		System.out.println("Unesite broj godina: ");
		int year = input.nextInt();
		double finalInvestment = investment * Math.pow((1+interes), year*12);
		System.out.println("Vrijednost nakon " + year + " godina je " + finalInvestment);
		input.close();
	}

}
