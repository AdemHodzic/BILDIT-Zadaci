import java.util.Scanner;
public class Quiz {

	public static void main(String[] args) {
		int rand1 = (int)(Math.random() * 100) + 1;
		int rand2 = (int)(Math.random() * 100) + 1;
		int oper = (int)(Math.random() % 6)+ 1;
		
		Scanner unos = new Scanner(System.in);
		System.out.println("Koliko je " + rand1 + " " + oper + " " + rand2 + " ?");
		System.out.println("Unesite tacan odgovor: " );
		int odgovor = unos.nextInt();

	}
	public static int sabiranje (int rand1, int rand2){
		return rand1 + rand2;
	}
	public static int oduzimanje (int rand1, int rand2){
		return rand1 - rand2;
	}
	public static int mnozenje (int rand1, int rand2){
		return rand1*rand2;
	}
	public static int dijeljenje(int rand1, int rand2){
		return rand1/rand2;
	}
	public static double korjenovanje(int rand1){
		return Math.sqrt(rand1);
	}
	public static int kvadriranje(int rand1){
		return rand1*rand1;
	}
}
