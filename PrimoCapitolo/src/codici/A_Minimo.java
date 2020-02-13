package codici;

import java.util.Random;

/*Primo codice che andremo ad analizzare col libro sarà la ricerca del minimo,
 * essendo il primo codice è molto banale e comunque migliorabile, ma è giusto per iniziare
 * a comprendere il pseudocodice allegato nel libro e per la comprensione di algoritmi futuri
 *
 *Dato un certo array, per semplicità di int, con lunghezza n, si scriva un metodo di nome minimo per
 *con argomenti di entrata un array int e un int con la sua lunghezza e che ritorni il valore int minimo 
 *dell'array
 */

public class A_Minimo {
	public static int min(int[] array, int n) {
		int min = array[0];
		if(array.length == 0) {
			System.out.println("Errore lunghezza array");
			System.exit(0);
		}
		else {
			for(int i = 1; i < array.length;i++) {
				if(array[i] < min) {
					min = array[i];
				}
			}
		}
		return min;
	}
}

/*Codice tester
 * 
 * import codici.A_Minimo;
 * import utilLib.Array;
 * 
 * public class Main {
	public static void main(String[] args) {
		int[] array = Array.creaArr_10(10);
		System.out.print("[");
		for(int j = 0; j < array.length; j++) {
			if(j == array.length-1) {
				System.out.print(" "+array[j]);
				System.out.println(" ]");
				break;
			}
			System.out.print(" "+array[j]+" , ");
		}
		System.out.println("Il minimo è : "+A_Minimo.min(array, array.length));
	}
}
*/

