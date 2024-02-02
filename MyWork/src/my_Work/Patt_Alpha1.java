package my_Work;

/*abc
 *de
 *f
 */
public class Patt_Alpha1 {
public static void main(String[] args) {
	char ch='a';
for (char i = 1; i <=3; i++) {
	for(char j=1;j<=3;j++) {
		if(j>=i) {
			System.out.print(ch++);
		}
		
	}
	System.out.println();
}	
}
}
