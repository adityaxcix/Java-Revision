package sorting;

import java.util.Arrays;

public class BubbleSort {
	static void bubbleSort(int arr[]) {
		int size = arr.length;
		for (int i = 0; i < size - 1; i++) {
			for (int j = 0; j < size - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;

				}
			}
		}

	}

	public static void main(String[] args) {

		int arr[] = { 34, 65, 32, 7, 12, 2, 98 };
		bubbleSort(arr);
		System.out.println(Arrays.toString(arr));
	}
}