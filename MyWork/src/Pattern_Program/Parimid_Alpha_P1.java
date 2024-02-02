package Pattern_Program;

public class Parimid_Alpha_P1 {
public static void main(String[] args) {
	int star=-1,space=5;int n=1;
	for(int i=1;i<=5;i++) {
		star+=2;space--;
		for(int j=1;j<=space;j++) {
			System.out.print(" ");
		}
		for(int k=1;k<=star;k++) {
			System.out.print(n);
		}
		n++;
		System.out.println();
	}
}
}
