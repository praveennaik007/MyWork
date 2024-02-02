package number_Program;

public class Harshad_Number {
//1-10,12,18,20,24,27,30,36,54,120,156,171 
public static void main(String[] args) {
	int num=36,temp=num,sum=0;
	while(num>0) {
		int d=num%10;
		sum=sum+d;
		num=num/10;
	}
	System.out.println("sum is : "+sum);
	if(temp%sum==0) {
		System.out.println("Harshad Number ");
	}else {
		System.out.println("Not Harshad Number ");
	}
}
}
