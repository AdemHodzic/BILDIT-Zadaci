package Zadatak5;

import java.util.*;

public class Sort {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite velicinu vase matrice: ");
		int velicina = input.nextInt();
		double array[][] = new double[velicina][velicina];
		System.out.println("Unesite "+velicina+"X"+velicina+" matricu: ");
		for(int i = 0;i<array.length;i++) {
			for(int j = 0;j<array.length;j++) {
				array[i][j] = input.nextDouble();
			}
		}
		
		System.out.println("Sortirana matrica izgleda ovako: ");
		
		double newArray[][] = sortRows(array); 
		
		for(int i = 0;i<array.length;i++) {
			for(int j = 0;j<array.length;j++) {
				System.out.print(newArray[i][j] + " ");
			}
			System.out.println();
		}
		
		input.close();
	}
	
	public static double[ ][ ] sortRows(double[ ][ ] array){
		for(int i = 0;i<array.length;i++) {
			sort(array[i]);
		}
		
		return array;
	}
	
	public static void sort(double arr[]) {
		for(int i = 0;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					arr[i]+=arr[j];
					arr[j] = arr[i] - arr[j];
					arr[i]-=arr[j];
				}
			}
		}
	}

}
