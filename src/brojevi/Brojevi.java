package brojevi;

import java.util.*;

public class Brojevi {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Izaberite opciju kouj zelite da ispisemo: ");
		int opcija = input.nextInt();
		switch(opcija){
		case 1:
			primeNum();
			break;
		case 2:
			emirp();
			break;
		case 3:
			fibonacciBrojevi();
			break;
		case 4:
			armstrongoviBrojevi();
			break;
		case 5:
			marsennePrime();
			break;

		}
		input.close();
	}

	public static void marsennePrime(){
		for(int i = 0;i<64;i++){
			if(isPrime(i) && (i-1)%2==0) System.out.print(i + " ");
		}
	}
	
	public static boolean isPrime(int num){
		if(num%2==0)return false;
		for(int i = 3;i<num;i+=2){
			if(num%i==0)return false;
		}
		return true;
	}
	
	public static boolean isPlaindrome(int num){
		String temp = Integer.toString(num);
		int len = temp.length() -1;
		for(int i = 0;i<temp.length();i++){
			if(temp.charAt(i) == temp.charAt(len)) return true;
			len--;
		}
		return false;
	}
}
