package Manasa_Mam;

public class Missing_Number {
public static void main(String[] args) {
	int nums[]= {0,1,2,3,5};
	System.out.println(missingNumber(nums));
}
public static  int missingNumber(int[] nums) {
    int sum=0;
    int a=nums.length;
   for(int i=0;i<nums.length;i++){
       sum+=nums[i];
   }
   int sum1=a*(a+1)/2;
   int res=sum1-sum;
   return res; 
}
}
