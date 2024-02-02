package my_Work;

public class Bubble_Sort {
public static void main(String[] args) {
	int a[]= {40,20,50,30,10};
	int temp=0;
	for (int i = 0; i < a.length; i++) {
		for (int j = 0; j < a.length-1-i; j++) {
			if(a[j]>a[j+1])
			{
//				System.out.println(a[i]);
				 temp=a[j];
				 a[j]=a[j+1];
				 a[j+1]=temp;
			}
		}	
	}
	for (int i = 0; i < a.length; i++) {
		System.out.println(a[i]);
	}
}
}
