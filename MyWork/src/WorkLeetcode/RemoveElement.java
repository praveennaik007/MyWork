package WorkLeetcode;

public class RemoveElement {
public static int removeElement(int x[],int val)
{
	int y=0;
	for(int i=0;i<x.length;i++)
	{
		if(x[i]!=val)
		{
			x[y]=x[i];
			y++;
		}
	}
	return y;
}
public static void main(String[] args) {
	int x[]= {3,2,2,3};
	
	int val=3;
System.out.println( removeElement(x, val));

//	for (int i = 0; i < x.length; i++) {
//		if(x[i]!=val)
//		{
//			System.out.println(x[i]);
//			break;
//		}
//	}
}
}
