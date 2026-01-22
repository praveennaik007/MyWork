package Array_One_D;

public class Avg_Num_Divisible_by_3 {
	public static void main(String[] args) {
		int nums[]= {1,2,3,4,5};
		int n=nums.length;
		System.out.println(avg(nums, n));
	}
	public static int avg(int nums[],int n) {
		int sum=0;
		int y=0;
		for (int i = 0; i < nums.length; i++) {
			sum+=nums[i];	
		}
		
		int x=sum/n;
		if(x%3==0) {
			y=x;
		}
		return y;
	}
}
