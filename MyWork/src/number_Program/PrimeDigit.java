package number_Program;

import java.util.Arrays;

public class PrimeDigit {
public static void main(String[] args) {
//	int n = 2735, sum = 0;
//	while(n > 0){
//	    int d = n % 10;
//	    if(d == 2 || d == 3 || d == 5 || d == 7) sum += d;
//	    n /= 10;
//	}
//	System.out.println(sum);
//	int[][] a={{1,2},{3,4}};
//	int sum=0;
//	for(int i=0;i<a.length;i++)
//	    for(int j=0;j<a[i].length;j++)
//	        sum+=a[i][j];
//	System.out.println(sum);
	
//	int[] a={1,2,3,2,4};
//	int rep=-1;
//	for(int i=0;i<a.length;i++)
//	    for(int j=i+1;j<a.length;j++)
//	        if(a[i]==a[j]) { rep=a[i]; break; }
//	System.out.println(rep);
//	int[] a={1,2,4,5};
//	int n=5,sum=(n*(n+1))/2;
//	for(int i:a) sum-=i;
//	System.out.println(sum);
//	int[] a={1,2,3,4};
//	boolean sorted=true;
//	for(int i=0;i<a.length-1;i++)
//	    if(a[i]>a[i+1]) sorted=false;
//	System.out.println(sorted);
//	int[] a={1,2,3};
//	int last=a[a.length-1];
//	for(int i=a.length-1;i>0;i--) a[i]=a[i-1];
//	a[0]=last;
//	System.out.println(Arrays.toString(a));
//	int[] a={1,2,3,2};
//	boolean f=false;
//	for(int i=0;i<a.length;i++)
//	  for(int j=i+1;j<a.length;j++)
//	    if(a[i]==a[j]) f=true;
//	System.out.println(f);
//	int[] a={1,2}, b={3,4};
//	int[] c = new int[a.length+b.length];
//	System.arraycopy(a,0,c,0,a.length);
//	System.arraycopy(b,0,c,a.length,b.length);
//	System.out.println(Arrays.toString(c));
//	int[] a={1,2,3,4,5};
//	int k=2;
//	for(int i=0;i<k;i++){
//	    int last=a[a.length-1];
//	    for(int j=a.length-1;j>0;j--) a[j]=a[j-1];
//	    a[0]=last;
//	}
//	System.out.println(Arrays.toString(a));
//	int[] a={1,2,2,3,1,4};
//	int count=0;
//	for(int i=0;i<a.length;i++){
//	    boolean f=false;
//	    for(int j=0;j<i;j++) if(a[i]==a[j]) f=true;
//	    if(!f) count++;
//	}
//	System.out.println(count);
//	int[] a={2,4,5,6,7};
//	int sum=0;
//	for(int n:a){
//	    boolean p=true;
//	    for(int i=2;i<=Math.sqrt(n);i++) if(n%i==0) p=false;
//	    if(n>1 && p) sum+=n;
//	}
//	System.out.println(sum);
//	int[] a={1,2,3,4,5};
//	int sum=0;
//	for(int n:a) sum+=n;
//	double avg=sum/a.length;
//	int count=0;
//	for(int n:a) if(n>avg) count++;
//	System.out.println(count);
//	int[] a={16,17,4,3,5,2};
//	int max=Integer.MIN_VALUE;
//	for(int i=a.length-1;i>=0;i--){
//	    if(a[i]>max){ System.out.print(a[i]+" "); max=a[i]; }
//	}
//	int[] a={1,-2,3,-4};
//	for(int i=0;i<a.length;i++) if(a[i]<0) a[i]=0;
//	System.out.println(Arrays.toString(a));
//	int[] a={1,3,5,2};
//	int min=0,max=0;
//	for(int i=0;i<a.length;i++){
//	    if(a[i]<a[min]) min=i;
//	    if(a[i]>a[max]) max=i;
//	}
//	int t=a[min]; a[min]=a[max]; a[max]=t;
//	System.out.println(Arrays.toString(a));
//	int[] a={1,3,5}, b={2,4,6};
//	int[] c=new int[a.length+b.length]; 
//	System.arraycopy(a,0,c,0,a.length); 
//	System.arraycopy(b,0,c,a.length,b.length);
//	Arrays.sort(c);
//	System.out.println(Arrays.toString(c));
//	int[] a={1,2,2,3,4};
//	int len=1,maxLen=1;
//	for(int i=1;i<a.length;i++){
//	    if(a[i]>a[i-1]) len++;
//	    else len=1;
//	    if(len>maxLen) maxLen=len;
//	}
//	System.out.println(maxLen);
//	String s="AbC";
//	String r="";
//	for(char ch:s.toCharArray())
//	    if(ch>='a'&&ch<='z') r+=(char)(ch-32);
//	    else r+=(char)(ch+32);
//	System.out.println(r);

//	String s="swiss";
//	char ch=' ';
//	for(int i=0;i<s.length();i++){
//	    if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i))){
//	        ch=s.charAt(i);
//	        break;
//	    }
//	}
//	System.out.println(ch);
//	String s="hi ok";
//	String[] a=s.split(" ");
//	String r="";
//	for(String w:a){
//	    r+=new StringBuilder(w).reverse()+" ";
//	}
//	System.out.println(r.trim());
//	String s="azby";
//	char max='A';
//	for(char ch:s.toCharArray()) if(ch>max) max=ch;
//	System.out.println(max);
//	String s="hello";
//	char[] a=s.toCharArray();
//	char t=a[0]; a[0]=a[a.length-1]; a[a.length-1]=t;
//	System.out.println(new String(a));
//	String s="aB1";
//	String r="";
//	for(char ch:s.toCharArray())
//	 if(Character.isLetter(ch))
//	  r += Character.isUpperCase(ch)?Character.toLowerCase(ch):Character.toUpperCase(ch);
//	 else r+=ch;
//	System.out.println(r);
	String s="AbBa";
	System.out.println(new StringBuilder(s).reverse().toString().equals(s));


}
}
