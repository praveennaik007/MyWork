package Array_Programs;

public class Sub_Array_Sum_To__K {

	public static int subarraySum(int[] nums, int k) {
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			int temp = 0;
			for (int j = i; j < nums.length; j++) {
				temp += nums[j];

				if (temp == k) {
					count++;

				}
			}
		}
		return count;
	}

	public static void main(String[] args) {

		int[] a = { 1, 2, 3, 4, 5 };
//		int[] b = { 2, 3, 4 };
		System.out.println(subarraySum(a, 7));
	}
}
