package Exceptions;

public class User {
public static void main(String[] args) {
	int age=20;
	if(age<21) {
		throw new User_Main("you are not eligible for the marriage");
	}else {
		System.out.println("Enjoy the life...");
	}
	System.out.println("Happy Married life ");
//	int a[]={1,2,3,4,5};
//	for(int i=0;i<a.length-2;i++){
//	System.out.print(a[i]+" ");
//	}
//	int a=4;
//	while(a>0) {
//		System.out.println(--a +" ");
//		break;
//	}
//	int i=5;
//	System.out.println((i/2) + i++ +i-- + --i + ++i);
}

}
