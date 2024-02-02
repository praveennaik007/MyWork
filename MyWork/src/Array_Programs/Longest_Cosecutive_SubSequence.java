package Array_Programs;

public class Longest_Cosecutive_SubSequence {
	public static void main(String[] args) {
		int a[]= {1,2,5,6,7,8,12,3,4,5,7,9};
		System.out.println( longest_Con_Seq(a));
	}

	private static int longest_Con_Seq(int[] a) {
		int max_Seq=0;
		if(a.length==1)return 1;
		for (int i = 0; i < a.length-1; i++) {
			int k=1;
			int j=i;
			if(a[i+1]>a[i]) {
				while(j<a.length-1&&a[j+1]>a[i]) {
					k++;
					j++;
				}
			}
			else if(a[i+1]<a[i]) {
				while(j<a.length-1&&a[j+1]>a[i]) {
					k++;
					j++;
				}
			}
			if(k>max_Seq) {
				max_Seq=k;
			}
		}
		return max_Seq;
	}

}
