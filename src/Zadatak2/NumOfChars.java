package Zadatak2;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class NumOfChars {

	public static void main(String[] args) {
		String comparator = "abcdefghijklmopqrstuvwxyzABCDEFGHIJKLMOPQRSTUVWXYZ";
		int numOfEachChar[] = new int[comparator.length()];
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite ime fajla sa kog zelite doznati broj karaktera: ");
		String imeFajla = input.nextLine();
		Path path = Paths.get("files/zadatak2/" + imeFajla + ".txt");
		input.close();
		if(!Files.exists(path)) {
			System.out.println("Neposotjeci file! Ponovno pokrenite program!");
			try {
				Files.createFile(path);
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.exit(1);
		}else {
			try {
				BufferedReader reader = Files.newBufferedReader(path);
				String temp;
				while((temp=reader.readLine())!=null) {
					for(int i = 0;i<temp.length();i++) {
						for(int j=0;j<comparator.length();j++) {
							if(temp.charAt(i)==comparator.charAt(j)) {
								numOfEachChar[j]++;
							}
						}
					}
				}
				reader.close();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
			for(int i = 0;i<comparator.length();i++) {
				if(numOfEachChar[i]==0)continue;
				System.out.println("Karakter " + comparator.charAt(i) + " se pojavljuje " + numOfEachChar[i] +" puta");
			}
		}
	}

}
