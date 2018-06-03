import java.util.*;
public class Najveci_zajednicki_djelilac {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite dva broj: ");
		int a = input.nextInt();
		int b = input.nextInt();
		System.out.println("Njihov zajednicki djelilac je " + djelilac(a,b));
	}
	
	public static int djelilac(int prviBroj, int drugiBroj) {
		if(drugiBroj==0) return prviBroj;
		return djelilac(drugiBroj,prviBroj%drugiBroj);
	}
}
