package brojevi;

public class Brojevi {

	public static void main(String[] args) {
		System.out.println("Hello world");

	}

	public static void primeNum() {
		for (int i = 0; i < 1000; i++) {
			if (isPrime(i)) {
				System.out.println(i + " ");
			}
		}
	}

	public static void emirp() {
		int count = 0, n = 2;
		while (count < 100) {
			if ((!isPalindrom(n) && isPrime(n))) {
				count++;
				System.out.print(n + " ");
			}
			n++;
		}
	}
}
