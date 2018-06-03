import java.util.*;
public class Samoglasnici {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite vas String: ");
		String str = input.nextLine();
		printSlova(str);
	}
	public static void printSlova(String str) {
		int samoglasnici=0,suglasnici=0;
		for(int i = 0;i<str.length();i++) {
			if(isSamoglasnik(str.charAt(i))) samoglasnici++;
			else suglasnici++;
		}
		System.out.println("U stringu " + str + "ima " +samoglasnici +" samoglasnika i " + suglasnici + " suglasnika.");
	}
	
	public static boolean isSamoglasnik(char c) {
		char samoglasnici[] = {'a','e','i','o','u'};
		for(char x:samoglasnici) {
			if(x==c) return true;
		}
		return false;
	}
}
