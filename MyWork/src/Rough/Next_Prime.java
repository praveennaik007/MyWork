package Rough;

public class Next_Prime {
	public static void main(String[] args) {
		int n = 3;
		boolean rs=false;
		while(!rs) {
			rs=true;
		n++;
		for (int i = 2; i <=n/2; i++) {
			if (n % i == 0) {
				rs=false;
				break;
			}
		}
		if (rs) {
			System.out.println(n);
		}
		}
	
	}
}
