package Loop;

public class Print_A_Z_a_z {
public static void main(String[] args) {
	int i=1;char ch1='A', ch2='a';
//	while(i<=26) {
//		System.out.println(ch1+" "+ch2);
//		ch1++;
//		ch2++;
//		i++;
//	}
	while(ch1<='Z') {
		System.out.print(ch1+""+ch2+" ");
		ch1++;ch2++;
	}
}
}
