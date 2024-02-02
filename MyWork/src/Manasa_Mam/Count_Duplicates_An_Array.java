package Manasa_Mam;

import java.util.Arrays;

public class Count_Duplicates_An_Array {
public static void main(String[] args) {
	int a[]= {1,2,3,4,5,1,2,3,1,3,1,1};
	Arrays.sort(a);
		int count1 = 0;// How many repeated number Present are counted only once
		//Ex:- 1,1,1 => 1;
		for (int i = 0; i < a.length; i++) {
		int count=0;//This count is Used To Reinitialize the Count variable
		for (int j = i+1; j < a.length; j++) {
			if(a[i]==a[j]) {
				count=1;
			}
			else {
				i=j-1;
				break;
			}	
		}
		count1=+count1+count;	
	}
	System.out.println(count1);
	
}
}
