package ArrayList_Programs;

import java.util.Arrays;
import java.util.List;

public class Print_Sum {
public static void main(String[] args) {
	Integer a[] = { 1, 2, 3, 4, 1, 2, 5, 7, 3, 4 };
	List<Integer> al = Arrays.asList(a);
	Integer n=0;
	for (int i = 0; i < al.size(); i++) {
		n+=al.get(i);
	}
	System.out.println(n);
}
}
