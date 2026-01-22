package Rough;

public class Print_Each_Num_Frm_1_100 {
public static void main(String[] args) {
//	for(int i=1;i<=100;i++) {
//			if(i*3==0) {
//				System.out.println("INNOVACX");
//				
//		}
//	}
	int a[][]= {{0,0,0,1},{0,1,1,1},{1,1,1,1},{0,0,0,0}};
	boolean rs=true;int max=0;int max1=0;
	for (int i = 0; i < a.length; i++) {
		int count=0;
		for (int j = 0; j < a[i].length; j++) {
			if(a[i][j]==1) {
				count++;
				rs=false;
			}
		}
		if(count>max) {
			max=count;
			max1=i;
		}
	}
	if(rs==false
			) {
		System.out.println(max);
	}
}
}
