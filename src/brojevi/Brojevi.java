package brojevi;

public class Brojevi {

	public static void main(String[] args) {
		System.out.println("Hello world");
		
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
	
	
}
