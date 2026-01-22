package ArrayList_Programs;

import java.util.Arrays;
import java.util.List;

public class Remove_Duplicate {
public static void main(String[] args) {
	Integer a[] = { 1, 2, 3, 4, 1, 2, 5, 7, 3, 4 };
	List<Integer> al = Arrays.asList(a);
	for (int i = 0; i < al.size(); i++) {
		int count = 1;
		for (int j = i + 1; j < al.size(); j++) {
			if (al.get(i) == al.get(j)) {
				count++;
				al.set(j, -1);
			}
		}
		if (al.get(i) != -1 && count > 0) {
			System.out.print(al.get(i)+" ");
		}
	}
}
}
