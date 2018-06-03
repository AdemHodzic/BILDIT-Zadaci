package Zadatak3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileNaopako {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite ime file-a: ");
		String imeFilea = input.nextLine();
		Path path = Paths.get("files/zadatak3/" + imeFilea + ".txt");
		if(!Files.exists(path)) {
			System.out.println("Nepostojeci file!\nPonovno pokrenite program\n");
			try {
			Files.createFile(path);
			}catch(Exception e) {
				e.printStackTrace();
			}
			System.exit(1);
		}
		System.out.println("Unesite string koji zelite unijeti u file: ");
		String str = input.nextLine();
		try {
		BufferedWriter writer = Files.newBufferedWriter(path);
		writer.append(str);
		writer.close();
		BufferedReader reader = Files.newBufferedReader(path);
		String temp=reader.readLine();
		System.out.println(naopako(temp));
		reader.close();
		input.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}

	public static String naopako(String str) {
		String temp = "";
		for(int i = str.length()-1;i>-1;i--) {
			temp+=str.charAt(i);
		}
		return temp;
	}
}
