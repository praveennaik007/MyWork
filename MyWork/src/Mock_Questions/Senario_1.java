package Mock_Questions;

import java.util.Arrays;
import java.util.Scanner;

public class Senario_1 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the name1 : ");
	String s1=sc.next();
	System.out.println("Enter the name2 : ");
	String s2=sc.next();
	String s3=s1+s2;
	char ch[]=s3.toCharArray();
	int b[]=new int[ch.length];
	for (int i = 0; i < ch.length; i++) {
		b[i]=ch[i];
	}
	System.out.println(Arrays.toString(b));
	int sum1=0;
	int sum2=0;
	for (int i = 0; i < b.length; i++) {
		if(b[i]%2==0) {
			sum1+=b[i];
		}else {
			sum2+=b[i];
		}
	}
	System.out.println(sum1);
	System.out.println(sum2);
	if(sum1==sum2) {
		System.out.println("Best Friends");
	}else {
		System.out.println("Best Enimies");
	}
}
}
