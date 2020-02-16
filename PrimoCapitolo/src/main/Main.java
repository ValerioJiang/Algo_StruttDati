package main;

import java.util.Scanner;

import primoCapitolo.B_RicercaBinaria;
import secondoCapitolo.A_SelectionSort;
import utilLib.Array;


public class Main {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr = Array.creaArr_10(10);
		System.out.println("Before");
		Array.printArr(arr);
		System.out.println("After");
		A_SelectionSort.selSort(arr);
		Array.printArr(arr);
		
	}
}
