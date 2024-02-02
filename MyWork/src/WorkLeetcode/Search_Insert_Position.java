package WorkLeetcode;

public class Search_Insert_Position {
public static void main(String[] args) {
	int a[]= {1,3,5,6};
	System.out.println(searchInsert(a, 5));
}
public static int searchInsert(int[] nums, int target) {
    
    int i=0;
				int res = 0;
	for( i=0;i<nums.length;i++){
if (nums[i] == target) {
	res= i;	
	break;
} else if (nums[i] > target) {
	res= i ;
	break;	
} else if (nums[i] == target - 1) {
	res= i + 1;
	break;
}
		else
		{
			 res=nums.length;
				
		}
}
return res; 
}
}
