package number_Program;

public class ReverseInteger {
	public static int reverse(int x)
	{
		int rev=0;
		while(x!=0)
		{
			int d=x%10;
			if(rev>Integer.MAX_VALUE/10||rev<Integer.MIN_VALUE/10)
			{
				return 0;
			}
			rev=rev*10+d;
			x/=10;
		}
		return rev;
	}
public static void main(String[] args) {
	int x=120;
	System.out.println(reverse(x));
}
}
