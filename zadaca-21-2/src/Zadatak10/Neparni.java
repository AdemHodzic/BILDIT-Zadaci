package Zadatak10;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Neparni {

	//Radi samo za integere i baca gresku ako se ubaci nesto drugo osim integera
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite ime file-a sa kojim zelite da radite: ");
		String ime = input.nextLine();
		Path path = Paths.get("files/zadatak10/" + ime +".txt");
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
			System.out.print("Brojevi u file-u su: ");
			while((temp=reader.readLine())!=null) {
				String[] arr = temp.split(" ");
				for(String str:arr) {
					if(Integer.parseInt(str)%2!=0)System.out.print(str + " ");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
