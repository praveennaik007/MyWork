package collection_Framework;

import java.util.Comparator;

public class Comparator_Marks implements Comparator<Comparator_Stu> {

	public int compare(Comparator_Stu o1, Comparator_Stu o2) {
		if (o1.Marks > o2.Marks)
			return 1;
		else if (o1.Marks < o2.Marks)
			return -1;
		return 0;
	}

}
