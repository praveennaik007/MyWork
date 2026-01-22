package Array_One_D;

public class Sum_Of_Two_Arrays_Equalto_Given_num {
	public static void main(String[] args) {
		//It will work only  the number beside the number
		//sum is equal to the given number
		int a[]= {1,5,6,4,2,4,5};
		int target=8;
//		for (int i = 0; i < a.length-1; i++) {
//			if(a[i]+a[i+1]==target) {
//				System.out.println(a[i]+" "+a[i+1]);
//			}
//		}
//		System.out.println();
		//This Code Will Work For All Types of numbers
		for (int i = 0; i < a.length; i++) {
			for (int j = i+1; j < a.length; j++) {
				if(a[i]+a[j]==target)
				{
					System.out.println(a[i]+" "+a[j]);
					
				}
			}
		}
	}
}
