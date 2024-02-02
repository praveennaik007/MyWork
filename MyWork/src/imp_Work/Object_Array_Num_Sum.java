package imp_Work;

public class Object_Array_Num_Sum {
	public static void main(String[] args) {
		Object obj[] = { "abc", 1, 8, 5, 'c', 10, 10 };
		int sum = 0;
		for (int i = 0; i < obj.length; i++) {

			if (obj[i] instanceof Integer) {
				int count = 0;
				for (int j = 0; j < obj.length; j++) {

					if (obj[i] == obj[j]) {
						count++;
					}
				}
				if (count == 1) {
					sum = sum + (Integer) obj[i];
				}
			}
		}
		System.out.println(sum);
	}
}
