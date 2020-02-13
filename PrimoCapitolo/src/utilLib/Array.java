package utilLib;

import java.util.Random;

public class Array {
	public static void printArr(int[] array) {
		System.out.print("[");
		for(int j = 0; j < array.length; j++) {
			if(j == array.length-1) {
				System.out.print(" "+array[j]);
				System.out.println(" ]");
				break;
			}
			System.out.print(" "+array[j]+" , ");
		}
	}
	public static int[] sortArr(int[] array) {
		int[] arr = array;
		for(int i = 0; i < arr.length;i++) {
			for(int j = i+1; j < arr.length;j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
	}
	
	//metodo che crea un array casuale di int lungo deciso dall'utente
	public static int[] creaArr_10(int num) {
		int[] array = new int[num];  //per testare useremo un array di 10 elementi randoma tra 0 e 10
		Random rand = new Random();
		for(int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(11);
		}
		return array;
	}
	
}
