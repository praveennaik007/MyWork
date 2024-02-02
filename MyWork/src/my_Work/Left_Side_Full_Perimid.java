package my_Work;

public class Left_Side_Full_Perimid {
public static void main(String[] args) {
	int r=5;
	for(int i=1;i<=r*2-1;i++) {
		for(int j=1;j<=r;j++) {
			if(j<=i) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
		}
		System.out.println();
	}
}
}
