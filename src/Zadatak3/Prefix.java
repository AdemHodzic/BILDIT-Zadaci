package Zadatak3;

import java.util.*;

public class Prefix {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite vas prvi String: ");
		String str1 = input.nextLine();
		System.out.println("Unesite vas drugi String: ");
		String str2 = input.nextLine();
		
		System.out.println("\nNajveci zajednicki prefix za ova dva Stringa je " + prefix(str1,str2));
		input.close();
	}
	
	public static String prefix(String str1, String str2) {
		String temp = "";
		int min = Math.min(str1.length(), str2.length());
		for(int i = 0;i<min;i++) {
			if(str1.charAt(i) == str2.charAt(i)) temp+=str1.charAt(i);
			else break;
		}
		
		return temp;
	}

}
