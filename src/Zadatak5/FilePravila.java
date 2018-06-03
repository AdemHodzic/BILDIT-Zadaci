package Zadatak5;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FilePravila {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite ime fajla kojeg zelite da koristite: ");
		String ime = input.nextLine();
		Path path = Paths.get("files/zadatak5/" + ime + ".txt");
		input.close();
		if(!Files.exists(path)) {
			System.out.println("Neposotjeci file!\nPonovno pokrenite vas program i file ce se automatski kreirati.");
			try {
				Files.createFile(path);
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.exit(1);
		}
		try {
			BufferedReader reader = Files.newBufferedReader(path);
			String temp;
			while((temp=reader.readLine())!=null) {
				if(temp.length()<55) {
					System.out.println(temp);
				}else {
					temp=temp.substring(0,40);
					temp+="...<Read More>";
					System.out.println(temp);
				}
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
