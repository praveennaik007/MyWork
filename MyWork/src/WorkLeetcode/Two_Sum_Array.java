package WorkLeetcode;

public class Two_Sum_Array {
public static void main(String[] args) {
	int nums[]= {2,7,11,15};
	int target=9;
	
	int a[]=twoSum(nums, target);
	for (int i = 0; i < a.length; i++) {
		System.out.print(a[i]+" ");
	}
}
public static int[] twoSum(int[] nums, int target) {
	int res=0;
	int b[]=new int[2];
	for (int i = 0; i < nums.length; i++) {
		for (int j = i+1; j < nums.length; j++) {
			if(nums[i]+nums[j]==target) {
				b[res]=i;
				res++;
				b[res]=j;
				
			}
		}
	}
	
	return b;
}
}
