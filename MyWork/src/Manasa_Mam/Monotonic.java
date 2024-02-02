package Manasa_Mam;

public class Monotonic {
	public static void main(String[] args) {
		int nums[] = { 1, 2, 2, 3 };
		boolean flag = false;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] <= nums[i + 1]) {
				flag = true;
			} else {
				flag = false;
				break;
			}
		}

		boolean rs = false;
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] >= nums[i + 1]) {
				rs = true;
			} else {
				rs = false;
				break;
			}
		}
		if (nums.length != 1) {

			// return flag || rs;
			System.out.println(flag || rs);
		} else {
			// return true;
			System.out.println(true);
		}
	}
}
