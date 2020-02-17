package secondoCapitolo;

public class B_InsertionSort {
	public static int[] inserSort(int[] array, int n) {
		for(int i = 1; i < n; i++) {
			int temp = array[i];
			int j = i;
			while(j > 1) {
				array[j] = array[j-1];
				j = j-1;
			}
			array[j] = temp;
		}
		return array;
	}
}
