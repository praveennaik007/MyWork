package Rough;

public class Local_Member {
public static void main(String[] args) {
	int i=10;
	 int k=20;
	{
		k=30;
		int j=20;
		System.out.println(j);
	}
	System.out.println(k);
	System.out.println(i);
	
}
}
