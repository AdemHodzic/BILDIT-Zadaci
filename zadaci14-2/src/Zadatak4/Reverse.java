package Zadatak4;

import java.util.*;

public class Reverse {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		System.out.println("Unesite vase brojeve");
		for(int i = 0;i<10;i++) {
			int temp = input.nextInt();
			list.add(temp);
		}
		reverse(list);
		input.close();
	}
	
	public static void reverse(ArrayList<Integer> list){
		int arr[] = new int[10];
		int index = list.size()-1;
		for(int i = 0;i<10;i++) {
			arr[i] = list.get(index);
			index--;
		}
		System.out.println("Reverse lista je: ");
		for(int x:arr) {
			System.out.print(x + " ");
		}
	}

}
