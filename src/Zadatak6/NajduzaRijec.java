package Zadatak6;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class NajduzaRijec {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite ime file-a sa kojim zelite da radite: ");
		String ime = input.nextLine();
		input.close();
		Path path = Paths.get("files/zadatak6/" + ime + ".txt");
		if(!Files.exists(path)) {
			try {
				System.out.println("Nepostojeci file!\nPonovno pokrenite program i file ce se kreirati.");
				Files.createFile(path);
				System.exit(1);
			}catch(Exception e) {
				e.printStackTrace();
			}
		}
		try {
			BufferedReader reader = Files.newBufferedReader(path);
			String temp;
			int counter = 1;
			while((temp=reader.readLine())!=null) {
				String[] arr = temp.split(" ");
				String max = arr[0];
				for(int i = 1;i<arr.length;i++) {
					if(arr[i].length()>max.length()) max=arr[i];
				}
				System.out.println("najveca rijec u liniji " + counter + " je " + max);
				counter++;
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
