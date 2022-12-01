package com.array;

public class SecondHighest {

	public static void main(String[] args) {
		int count = 0;
		int arr[] = { 100, 14, 46, 47, 94, 94, 52, 86, 36, 94, 89 };
		// 1.we will sort the array
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;

				}

			}
		}

		// remove the duplicate element

		for (int k = 0; k < arr.length - 1; k++) {

			if (arr[k] != arr[k + 1]) {
				arr[count] = arr[k];
				count++;
			}

		}
		arr[count++] = arr[arr.length - 1];

		// Printing the unique element
		for (int l = 0; l < count; l++) {
			System.out.print(arr[l] + ",");
		}
		// second highest element
		System.out.println();
		System.out.println("second highest element:-" + arr[count - 2]);
	}

}
