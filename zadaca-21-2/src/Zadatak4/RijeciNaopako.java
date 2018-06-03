package Zadatak4;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class RijeciNaopako {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite ime fajla iz kojeg zelite da koristite: ");
		String filename = input.nextLine();
		Path path = Paths.get("files/zadatak4/" + filename + ".txt");
		if(!Files.exists(path)) {
			System.out.println("Nepostojeci file! \nPonovno pokrenite program i file ce se kreirati!");
			try {
			Files.createFile(path);
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.exit(1);
		}
		try {
			BufferedReader reader = Files.newBufferedReader(path);
			String str = reader.readLine();
			String[] strs = str.split(" ");
			for(int i = strs.length-1;i>-1;i--) {
				System.out.print(strs[i] + " ");
			}
			reader.close();
			input.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

}
