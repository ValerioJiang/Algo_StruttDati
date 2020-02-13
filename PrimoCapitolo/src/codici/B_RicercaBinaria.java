package codici;

/*Secondo algoritmo che andremo ad analizzare sarà la ricerca binaria (o ricerco dicotomica)
 * 
 * Dato un array ordinato in modo crescente di integer, e dato un numero che chiameremo numTar
 * si crei una funzione che abbia in entrata un array di int e numTar e verificare in quale posizione sia
 * e se non c'è indicare con la posizione -1
 * 
 * 
 */

public class B_RicercaBinaria {
	public static int binarySearch(int[] array, int numTar, int i, int j) {
		if(i > j) {
			return -1;
		}
		else {
			int m = (i+j)/2;
			if(array[m] == numTar) {
				return m;
			}
			else if(array[m] < numTar) {
				return binarySearch(array, numTar, m+1, j);
			}
			else
				return binarySearch(array,numTar, i, j-1);
		}
	}
}

/*classe tester
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
		int find = B_RicercaBinaria.binarySearch(arr, tarNum, 0, arr.length);
		if(find == -1) {
			System.out.println("Your "+tarNum+" is not in the array.");
		}
		else
			System.out.println("Your "+tarNum+" is in the position "+find);
	}
}
*/