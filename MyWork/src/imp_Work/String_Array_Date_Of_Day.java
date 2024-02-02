package imp_Work;

import java.util.Scanner;

public class String_Array_Date_Of_Day {
	int dd;
	int mm;
	int yy;
	int month[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
	String dname[]= {"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};

	String_Array_Date_Of_Day(int dd,int mm,int yy)
	{
		super();
		this.dd=dd;
		this.mm=mm;
		this.yy=yy;
		
		if(yy%4==0&&yy%100!=0||yy%400==0)
			month[2]=29;
	}
	public  int noOfDays()
	{
		int days=dd;
		int y=yy;
		days=days+y/4-y/100+y/400;
		for (int i = 1; i < mm; i++)
		{
			days=days+month[i];
		}
		return days;	
	}
	String getDayname()
	{
		return dname[noOfDays()%7];
	}
}

class MainStringDateOfDay 
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter first date(dd mm yyyy)");
	int d1=sc.nextInt();
	int m1=sc.nextInt();
	int y1=sc.nextInt();
	String_Array_Date_Of_Day dt1=new String_Array_Date_Of_Day(d1,m1,y1);
	System.out.println("enter second date(dd mm yyyy)");
	int d2=sc.nextInt();
	int m2=sc.nextInt();
	int y2=sc.nextInt();
	String_Array_Date_Of_Day dt2=new String_Array_Date_Of_Day(d2,m2,y2);
	System.out.println("first Date: "+dt1);
	System.out.println("second Date: "+dt2);
	
	int days=dt2.noOfDays() - dt1.noOfDays();
	
	System.out.println("no of days between two days "+days);
	System.out.println(dt1+" day name is "+dt1.getDayname());
	System.out.println(dt2+" day name is "+dt2.getDayname());
	}

}
