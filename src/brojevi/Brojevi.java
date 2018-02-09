package brojevi;

import java.util.*;

public class Brojevi {

	public static void main(String[] args) {
		
	}

	public static void fibonacciBrojevi(){
		int br1, br2, suma;
		
		for (br1 = 0, br2 = 1, suma = 0; suma < 100; suma = br1 + br2 ){
			System.out.print(suma + " ");
			
			br1 = br2;
			br2 = suma;
		}
		
	}
	public static void armstrongoviBrojevi(){
		int sum = 0;
		
		for (int i = 0; i < 1000; i++){
			sum = 0;
			
			int c = i;
			int r = c;
			
			while (c > 0){
				int b = c % 10;
				sum = b*b*b;
				
				c /= 10;
			}
			
			if (sum == r){
				System.out.println(r + " ");
			}
		}
	}
	
	
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
}
