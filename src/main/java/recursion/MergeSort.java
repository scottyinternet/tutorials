package recursion;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MergeSort {

		public static int counter = 0;

		public static void sort(List<Integer> arr) {
			int thisCounter = counter;
			char ch = (char) (thisCounter + 'A');
			String spaces = getSpaces(thisCounter);

			if (arr.size() > 1) {
				counter += 1;

				System.out.println(spaces + ch + " ~ sort( " + arr + " );");

				// Find the middle of the list
				int mid = arr.size() / 2;

				// Split the list into two halves
				List<Integer> left = new ArrayList<>(arr.subList(0, mid));
				List<Integer> right = new ArrayList<>(arr.subList(mid, arr.size()));
				System.out.println(spaces + ch +  " SPLIT LEFT " + ch + " " + left + " | RIGHT "  + ch + " "  + right);

				// Sort each half
				System.out.println(spaces + ch + " - SORT LEFT "  + ch + " "  + left);
				sort(left);
				System.out.println(spaces + ch + " - SORT RIGHT "  + ch + " "  + right);
				sort(right);

				// Merge the sorted halves
				merge(arr, left, right, spaces, ch);
			} else {
				System.out.println(spaces + ch + " BASE CASE " + arr);
			}
		}


	private static String getSpaces(int thisCounter) {
			String spaces = "";
			for(int i = 0; i < thisCounter; i++) {
				spaces += "       ";
			}
			return spaces;
	}

	private static void merge(List<Integer> arr, List<Integer> left, List<Integer> right, String spaces, char ch) {
		System.out.println(spaces + ch + " ~ merge( " + left + ", " + right + " );");
			int i = 0, j = 0, k = 0;

			// Merge left and right arrays
			while (i < left.size() && j < right.size()) {
				if (left.get(i) <= right.get(j)) {
					arr.set(k++, left.get(i++));
				} else {
					arr.set(k++, right.get(j++));
				}
			}

			// Copy remaining elements of left, if any
			while (i < left.size()) {
				arr.set(k++, left.get(i++));
			}

			// Copy remaining elements of right, if any
			while (j < right.size()) {
				arr.set(k++, right.get(j++));
			}
		System.out.println(spaces + ch + " - MERGED " + arr);
		}

		public static void main(String[] args) {
			List<Integer> arr = new ArrayList<>();
			fillValues(arr, 16);

			System.out.println("Given Array: " + arr);
			sort(arr);
			System.out.println("Sorted Array: " + arr);
		}

	private static void fillValues(List<Integer> arr, int quantity) {
		Random random = new Random();
		for(int i = 0; i < quantity; i++) {
			arr.add(random.nextInt(100));

		}
	}


}

