package Manasa_Mam;

public class Find_Peak_Element {
public static void main(String[] args) {
	int nums[]= {1,2};
	
		int large=0;
		int j=0;
		for ( j = 0; j < nums.length; j++) {
			if(nums[j]>large) {
				large=nums[j];
			}
		
	}
		int res=0;
	for (int i = 0; i < nums.length; i++) {
		if(nums[i]==large) {
			res=i;
		}
	}
	System.out.println(res);
	
	int max=0;
	   for(int i=0;i<nums.length;i++)
	   {
	       if(nums[i]>nums[max])
	       {
	           max=i;
	       }
	   }
	   System.out.println(max);
}
}
