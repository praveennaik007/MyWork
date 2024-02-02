package my_Work;

public class Permutation_Combination {
	public static void main(String[] args) {
		String s="ABC";
		int n=s.length();
		permit(s,0,n-1);
	}

	public static void permit(String str, int l, int r) {
		
		if(l==r) {
			System.out.println(str);
		}
		else {
			for(int i=1;i<=r;i++) {
				str=swap(str,l,i);
				permit(str,l+1,r);
				str=swap(str,l,i);
			}
		}
	}

	private static String swap(String str, int i, int j) {

        char temp;
        char[] ch=str.toCharArray();
        temp=ch[i];
        ch[i]=ch[j];
        ch[j]=temp;
		return String.valueOf(ch);
	}
}
