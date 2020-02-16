package secondoCapitolo;

/*Tra i primi algoritmi di ordinamento che andiamo ad affrontare c'è la selection sort
 * 
 * 
 */


public class A_SelectionSort {
	public static int[] selSort(int[] array) {
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
}
