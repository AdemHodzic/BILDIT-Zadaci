
public class ArrayCounter {

	public static void main(String[] args) {
		int arr[] = new int[100];
		int counter[] = new int[10];
		for(int i = 0;i<arr.length;i++) {
			arr[i] = (int)(Math.random()*10);
		}
		for(int i = 0;i<counter.length;i++) {
			counter[i] = 0;
		}
		
		for(int i = 0;i<arr.length;i++) {
			counter[arr[i]]++;
		}
		for(int i = 0;i<counter.length;i++) {
			System.out.println("Broj " + i + " se ponovio " + counter[i] +" puta.");
		}
		
	}
	
	

}
