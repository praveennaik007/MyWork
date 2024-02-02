package work_06_07_23;

public class Palindrome {
public static void main(String[] args) {
	int  n=121;
	int temp=n;
	int rev=0;
	while (n!=0) {
		int d=n%10;
		rev=10*rev+d;
		n/=10;
	}
	if(rev==temp) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not Palindrome");
	}
	
	int a[]= {1,2,1};
	int b[]=new int [a.length];
	int k=0;
	for (int i = a.length-1; i >=0; i--) {
		b[k++]=a[i];
		System.out.println(a[i]);
	}
	
	for (int i = 0; i < b.length; i++) {
		System.out.println(b[i]);
	}
	boolean rs=false;
		for (int i = 0; i < b.length; i++) {
			if(b[i]==a[i]) {
				rs=true;
			}
			else {
				rs=false;
			}
		}
		if(rs==true) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
		String s="madam";
		int temp1=0;int temp2=s.length()-1;
		boolean flag=false;
	while(temp1<temp2) {
		if(s.charAt(temp1)!=s.charAt(temp2)) {
			flag=false;
			break;
		}
		else {
			flag=true;
		}
		temp1++;
		temp2--;
	}
	if(flag==true) {
		System.out.println("Palindrome");
	}
	else {
		System.out.println("Not Palindrome ");
	}
}
}
