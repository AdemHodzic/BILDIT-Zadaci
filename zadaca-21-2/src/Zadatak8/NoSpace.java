package Zadatak8;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class NoSpace {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite ime file-a sa kojim zelite da radite: ");
		String ime = input.nextLine();
		Path path = Paths.get("files/zadatak8/" + ime +".txt");
		if(!Files.exists(path)) {
			System.out.println("Neposotjeci file!\nPonovno pokrenite program i file ce se kreirati.");
			try {
				Files.createFile(path);
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.exit(1);
		}
		input.close();
		try {
			BufferedReader reader = Files.newBufferedReader(path);
			String temp;
			while((temp=reader.readLine())!=null) {
				System.out.println(noSpace(temp));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static String noSpace(String str) {
		String temp = "";
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i)!=' ') temp+=str.charAt(i);
		}
		return temp;
	}

}
