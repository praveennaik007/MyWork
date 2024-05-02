package Array_Programs;

public class Search_Binary {
	public static void main(String[] args) {
		int a[] = { 10, 20, 30, 40, 50 };
		int low = 0;
		int high = a.length - 1;
		int mid = 0;
		int key = 20;

		boolean rs = false;
		while (low <= high) {
//		for(int i=low;i<=high;i++)	
//		{
			mid = (low + high) / 2;
			if (key == a[mid]) {
				rs = true;
				break;
			} else if (key > a[mid]) {
				low = mid + 1;
				high = high;
			} else {
				high = mid - 1;
				low = low;
			}

		}
		if (rs == true) {
			System.out.println("key is present at index " + (mid));
		} else {
			System.out.println("Not present ");
		}
		// }
	}
}
