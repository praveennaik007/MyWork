package Collection_Listproj;

import java.util.Comparator;

public class Comparator_Id implements Comparator<Comparator_Stu> {

	public int compare(Comparator_Stu o1, Comparator_Stu o2) {
		return o1.id - o2.id;
	}

}
