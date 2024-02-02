package j_Spider;

public class Sum_Of_Odd {
public static void main(String[] args) {
	boolean rs=false;
	int num=5;
	int i=2;
	while(num!=0) {
		num-=i;
		if(num==0) {
			rs=true;
			System.out.println("Even");
		}
	}
	if(rs==false) {
		System.out.println("Odd");
	}	
}
}
