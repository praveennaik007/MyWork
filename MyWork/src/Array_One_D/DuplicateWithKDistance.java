package Array_One_D;

import java.util.HashSet;

public class DuplicateWithKDistance {

	static boolean hasDuplicate(int[] arr, int k) {
		HashSet<Integer> set = new HashSet<>();

		for (int i = 0; i < arr.length; i++) {
			if (set.contains(arr[i])) {
				return true;
			}

			set.add(arr[i]);

			// Maintain window size k
			if (i >= k) {
				set.remove(arr[i - k]);
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 1 };
		int k = 3;

		System.out.println(hasDuplicate(arr, k));
	}

}
