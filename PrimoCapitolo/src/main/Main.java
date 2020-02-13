package main;

import java.util.Random;

import codici.Minimo;

public class Main {
	public static void main(String[] args) {
		int[] array = new int[10];  //per testare useremo un array di 10 elementi randoma tra 0 e 10
		Random rand = new Random();
		for(int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(11);
		}
		System.out.print("[");
		for(int j = 0; j < array.length; j++) {
			if(j == array.length-1) {
				System.out.print(" "+array[j]);
				System.out.println(" ]");
				break;
			}
			System.out.print(" "+array[j]+" , ");
		}
		System.out.println("Il minimo è : "+Minimo.min(array, array.length));
	}
}
