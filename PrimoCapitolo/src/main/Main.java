package main;

import java.util.Scanner;

import codici.B_RicercaBinaria;
import utilLib.Array;


public class Main {
	static Scanner scan = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr = Array.creaArr_10(10);
		System.out.println("Before");
		Array.printArr(arr);
		System.out.println("After");
		arr = Array.sortArr(arr);
		Array.printArr(arr);
		System.out.println("Digit a number to find in the array");
		int tarNum = scan.nextInt();
		int find = B_RicercaBinaria.iterBinarySearch(arr, tarNum, arr.length);
		if(find == -1) {
			System.out.println("Your "+tarNum+" is not in the array.");
		}
		else
			System.out.println("Your "+tarNum+" is in the position "+find);
	}
}
