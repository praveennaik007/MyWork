package my_Work;

import java.util.Arrays;

public class FrequencyOFSubString {

	public static void main(String[] args) {
		String s1="Hello Java      Hello         Java he he he Bye";
		String[] s2=s1.split(" ");
		String s3="";
//		for(int i=0;i<s2.length;i++)
//		{
//			int count=1;
//			for(int j=i+1;j<s2.length;j++)
//			{
//				if(s2[i].equals(s2[j]) && s2[i]!=" ")
//			{
//					s2[j]=" ";
//					count++;
//			}
//			}
//			if(count>=1 && s2[i]!=" ")
//			{
//				System.out.println(s2[i]+"="+count);
//			}
//			s3+=s2[i];
//		}
//		System.out.println(Arrays.toString(s2));
		
		//Another Approach
		
		for(int i=0;i<s2.length;i++)
		{
			if(s3.indexOf(s2[i])==-1) {
				int count=1;
				for(int j=i+1;j<s2.length;j++)
				{
					if(s2[i].equals(s2[j]))
					{
						count++;
					}
				}
				if(count>=1)
				{
					System.out.println(s2[i]+"="+count);
				}
			}
			s3+=s2[i];
		}
	}

}
