import java.util.*;
public class Niz {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		int count = 0;
		System.out.println("Unesite brojeve u niz.\n0 prekida unos");
		int temp = input.nextInt();
		while(temp!=0) {
			list.add(temp);
			count++;
			temp = input.nextInt();
		}
		int arr[] = new int[count];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = list.get(i);
		}
		
		System.out.println("Najveci broj je " + max(arr));
		printMax(max(arr),arr);
	}

	public static int max(int[] arr) {
		int max = arr[0];
		for(int i = 1;i<arr.length;i++) {
			if(arr[i]>max) max=arr[i];
		}
		
		return max;
	}
	
	public static void printMax(int max, int[] arr) {
		int count = 0;
		for(int i = 0;i<arr.length;i++) {
			if(arr[i]==max) count++;
		}
		
		System.out.println("Broj " + max + " se pojavio " +  count + " puta.");
	}
}
