package Zadatak5;

import java.util.*;

public class Slova {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesote vas string: ");
		String str = input.nextLine();
		brojiSlova(str);
		input.close();
	}
	
	public static void brojiSlova(String str) {
		int temp = 0;
		for(int i = 0;i<str.length();i++) {
			if(Character.isLetter(str.charAt(i))) temp++;
		}
		System.out.println("U stringu " + str + " ima " + temp + " slova.");
	}

}
