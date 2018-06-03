package Zadatak9;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Caps {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite ime file-a sa kojim zelite da radite: ");
		String ime = input.nextLine();
		Path path = Paths.get("files/zadatak9/" + ime +".txt");
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
				String[] arr = temp.split(" ");
				for(String str:arr) {
					str = str.substring(0, 1).toUpperCase() + str.substring(1);
					System.out.print(str + " ");
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
