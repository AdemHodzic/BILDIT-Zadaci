package zadatak3;

import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Unesite vas broj: ");
		int broj = input.nextInt();
		System.out.println("Vas brpj naopako je " + reverse(broj));
		input.close();
	}

	
	public static int reverse(int number) {
		if(isPalindrome(number)) {
			return number;
		}else {
			String str = "";
			while(number>0) {
				str += number%10;
				number/=10;
			}
			return Integer.parseInt(str);
		}
	}
	
	public static boolean isPalindrome(int number) {
		String str = Integer.toString(number);
		int temp = str.length()-1;
		for(int i = 0;i<str.length();i++) {
			if(str.charAt(i) != str.charAt(temp)) return false;
		}
		return true;
	}
}
