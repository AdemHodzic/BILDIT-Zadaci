package zadatak4;

import java.util.*;

public class NeparnePozicije {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("UNesite vas string: ");
		String str = input.nextLine();
		System.out.print("Karakteri na nepranim pozicijama su: ");
		for(int i = 0;i<str.length();i++) {
			if(i%2!=0) System.out.print(str.charAt(i));
		}
		input.close();
	}

}
