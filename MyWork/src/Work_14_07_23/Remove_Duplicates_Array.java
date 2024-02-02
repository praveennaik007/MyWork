package Work_14_07_23;

public class Remove_Duplicates_Array {
public static void main(String[] args) {
	int a[]= {1,3,5,9,3,9,0};
	boolean rs=false;
	for (int i = 0; i < a.length; i++) {
		for (int j = i+1; j < a.length; j++) {
			if(a[i]==a[j]) {
				a[j]=-1;
			}
		}
		if(a[i]!=-1) {
			System.out.println(a[i]);
		}
	}
}
}
