package Not_Work_All_Ways;

public class Reverse_Word_Same_Place {
public static void main(String[] args) {
	String s="Hello world hi  ";
	String res="";
	String str="";
	s=s+" ";
	for (int i = 0; i < s.length(); i++) {
		if(s.charAt(i)!=' ') {
			str+=s.charAt(i);
		}else {
			for (int j = str.length()-1; j>=0; j--) {
				res+=str.charAt(j);
			}
			
			res+=s.charAt(i);
			str="";
		}
	}
	
	System.out.println(res);
}
}
