package WorkLeetcode;

public class Palindrome {
public static void main(String[] args) {
	int a=121;
	System.out.println(isPalindrome(a));
}
public static boolean isPalindrome(int x) {
    int rev=0;
   int  temp=x;
    while(x>0)
    {
        int d=x%10;
        rev=rev*10+d;
        x/=10;
    }
    if(rev==temp)
    {
        return true;
    }
    else
    {
       return false;
    }
}
}
