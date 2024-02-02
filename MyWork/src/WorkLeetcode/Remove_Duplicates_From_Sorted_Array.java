package WorkLeetcode;


public class Remove_Duplicates_From_Sorted_Array {
public static void main(String[] args) {
	//It Will Work Only The number is in order wise
	int nums[]= {1,2,2,3,3,3,4,5};
	//int[] expectedNums = new int [nums.length]; // The expected answer with correct length

	int k = removeDuplicates(nums); // Calls your implementation
	System.out.println(k+" ");
	//assert k == expectedNums.length;
	for (int i = 0; i < k; i++) {
	   // assert nums[i] == expectedNums[i];
	    System.out.print(nums[i]);
	}
}
public static int removeDuplicates(int[] nums) {
	 int i=0;
         for(int j=i+1;j<nums.length;j++){
             if(nums[i]!=nums[j]){
               i++;
             }
             nums[i]=nums[j]; 
         }
    return i+1;
}
}
