package my_Work;

public class Search_Insertion_Position {
	public static void main(String[] args) {
	int nums[] = { 1, 3, 5, 6 };
	int target = 0;
	int i=0;
			for( i=0;i<nums.length;i++){
		if (nums[i] == target) {
			System.out.println(i);
			break;
		} else if (nums[i] > target) {
			System.out.println(i - 1);
			break;
		} else if (nums[i] == target - 1) {
			System.out.println(i + 1);
			break;
		}
		else
		{
			nums[i]=nums.length;
			System.out.println("0");
			break;
		}
		
		
	}
}

}
