package Strings;

import java.util.Arrays;

public class Split_Method {
public static void main(String[] args) {
	String s="Bring me a tea with biscuts";
//	s=s.trim();		
	String a[]=s.split(" ");
			
//			System.out.println(Arrays.toString(a));
//			for (int i = 0; i < a.length; i++) {
//				System.out.print(a[i]+" ");
//			}
//			System.out.println();
			int count=0;
			for (int i = 0; i < a.length; i++) {
				if(a[i]!=" ")
				count++;
			}
			System.out.println(count);
			
}
}
