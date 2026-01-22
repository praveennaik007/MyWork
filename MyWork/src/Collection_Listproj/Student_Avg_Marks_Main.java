package Collection_Listproj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Student_Avg_Marks_Main {
public static void main(String[] args) {
	ArrayList<Student_Avg_Marks> al=new ArrayList<Student_Avg_Marks>();
	al.add(new Student_Avg_Marks(1, "hi", 56.43));
	al.add(new Student_Avg_Marks(3, "hii", 76.43));
	al.add(new Student_Avg_Marks(5, "hello", 87.43));
	al.add(new Student_Avg_Marks(4, "hmm", 46.43));
	al.add(new Student_Avg_Marks(2, "hey", 96.43));
	System.out.println(al);
	double d=0;
	for (Student_Avg_Marks stu : al) {
		d+=stu.marks;
	}
	ArrayList<Student_Avg_Marks> al1=new ArrayList<Student_Avg_Marks>();
	double avg=d/al.size();
	for (Student_Avg_Marks stu : al) {
		if(stu.marks>avg) {
			al1.add(stu);
		}
	}
	System.out.println("Average : "+avg);
	Comparator<Student_Avg_Marks> c=(o1,o2)->{
		if(o1.marks>o2.marks) 
			return 1;
		if(o1.marks<o2.marks)
			return -1;
		return 0;
	};
	Collections.sort(al1, c);
	System.out.println(al1);
}
}
