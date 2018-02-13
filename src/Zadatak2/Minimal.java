package Zadatak2;

import java.util.*;

public class Minimal {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Unesite 10 brojeva: ");
		double array[] = new double[10];
		for(int i = 0;i<10;i++) {
			array[i] = input.nextDouble();
		}
		
		System.out.println("Najmanji broj je " + min(array));
		input.close();
	}
	
	public static double min(double[] array) {
		double min = array[0];
		for(int i = 1;i<array.length;i++) {
			if(array[i]<min) min = array[i];
		}
		
		return min;
	}
}
