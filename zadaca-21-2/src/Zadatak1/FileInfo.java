package Zadatak1;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.StringTokenizer;

public class FileInfo {

	public static void main(String[] args) {
		Path path = Paths.get("files/zadatak1/file.txt");
		int numOfChars=0,numOfWords=0,numOfLines=0;
		try {
			if(!Files.exists(path)) {
				Files.createFile(path);
			}
			BufferedReader input = Files.newBufferedReader(path);
			String temp;
			while((temp=input.readLine())!=null) {
				numOfLines++;
				numOfChars+=temp.length();
				numOfWords+=new StringTokenizer(temp, " ").countTokens();
			}
			input.close();
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("Broj karaktera u file-u je " + numOfChars
				+", \nBroj Rijeci u file-u je " + numOfWords
				+ ", \nBroj linija u file-u je " + numOfLines + ".");
	}

}
