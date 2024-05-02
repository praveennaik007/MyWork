package Company_Patterns;

public class Each_Word_First_Char_Upper {
	public static void main(String[] args) {
		String s = "hello world bye to bye";
		String str="";
		for (int i = 0; i < s.length(); i++) {
			if(i==0&&s.charAt(i)!=' '|| s.charAt(i)!=' '&&s.charAt(i-1)==' ') {
				System.out.println(s.charAt(i));
				str+=(char)(s.charAt(i)-32);
			}else {
				str+=s.charAt(i);
			}
		}
		System.out.println(str);
	}
}
