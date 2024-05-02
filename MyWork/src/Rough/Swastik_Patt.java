package Rough;

public class Swastik_Patt {
public static void main(String[] args) {
	for(int i=1;i<=5;i++) {
		for(int j=1;j<=5;j++) {
			if(i==3||j==3||(i==1&&i+j<=5/2+1)||(i==5&&i+j>6+1)||(j==1&&i+j>3)||j==5&&i+j<=6+1) {
				System.out.print("*"+" ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}
