package Zadatak7;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Predzadnja {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite ime file-a sa kojim zelite da radite: ");
		String ime = input.nextLine();
		Path path = Paths.get("files/zadatak7/" + ime +".txt");
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
			int counter = 1;
			while((temp=reader.readLine())!=null) {
				String[] arr = temp.split(" ");
				int index = arr.length-2;
				System.out.println("Predzadnja rijec u liniji " + counter + " je " + arr[index]);
			}
			reader.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
				
	}

}
