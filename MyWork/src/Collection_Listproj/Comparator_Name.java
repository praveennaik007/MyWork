package Collection_Listproj;

import java.util.Comparator;

public class Comparator_Name implements Comparator<Comparator_Stu>{

	public int compare(Comparator_Stu o1, Comparator_Stu o2) {
		return o1.name.compareTo(o2.name);
	}

}
