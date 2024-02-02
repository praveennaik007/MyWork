package Rough;

import java.util.Arrays;
import java.util.Hashtable;

public class Demo {
//	final int i;
//	public Demo() {
//		this.i=10;
//	}
public static void main(String[] args) {
//	Demo d=new Demo();
//	System.out.println(d.i);
//	if(System.out.printf("Hello World")==null) {
//		
//	}
//	Hashtable<Integer, Object> m=new Hashtable<Integer, Object>();
//	m.put(3, 10);
//	m.put(1, 30);
//	m.put(4, 40);
//	m.put(2, 20);
//	m.put(5, 50);
//	m.put(3, 50);
//	System.out.println(m);
//	System.out.println((String)null);
//	String s="java";
//	for(int i=0;i<s.length();i++) {
//		char ch=s.charAt(0);
//	System.out.print(ch+" ");
//	} 	
	
	String s="otown";
	String str="two";
	String st="";
	char ch[]=s.toCharArray();
	Arrays.sort(ch);
	char ch1[]=str.toCharArray();
	for (int i = 0; i < ch.length; i++) {
		for (int j = 0; j < ch1.length; j++) {
			if(ch[i]==ch[j]) {
				st+=s.charAt(i);	
			}
		}	
	}
	System.out.println(st);
	
}
}
