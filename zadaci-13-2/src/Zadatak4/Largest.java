package Zadatak4;

public class Largest {

	public static int[ ] locateLargest(double[ ][ ] a) {
		int maxRow = 0;
		int maxCol = 0;
		double maxNum = a[0][0];
		for(int i = 0;i<a.length;i++) {
			for(int j = 0;j<a[0].length;j++) {
				if(a[i][j]>maxNum) {
					maxNum = a[i][j];
					maxRow = i;
					maxCol = j;
				}
			}
		}
		int arr[] = new int[2];
		arr[0] = maxRow;
		arr[1] = maxCol;
		return arr;
	}
}
