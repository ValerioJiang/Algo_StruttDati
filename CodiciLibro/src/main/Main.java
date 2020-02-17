package main;

import java.util.Scanner;

import primoCapitolo.B_RicercaBinaria;
import secondoCapitolo.A_SelectionSort;
import secondoCapitolo.B_InsertionSort;
import utilLib.Array;
//main

public class Main {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int[] array = Array.creaArr_10(10);
		System.out.println("Before");
		Array.printArr(array);
		System.out.println("After");
		for(int i = 1; i < array.length; i++) {
			int temp = array[i];
			int j = i;
			while((j >= 1) && (array[j-1] > temp)) {
				array[j] = array[j-1];
				j = j-1;
			}
			
			array[j] = temp;
			Array.printArr(array);
		}
		Array.printArr(array);
		
	}
}
