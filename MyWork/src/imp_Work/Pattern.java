package imp_Work;

public class Pattern {
public static void main(String[] args) {
	int start=-1,end=3;
	System.out.println(simple(start,end));
}

private static int simple(int start, int end) {
	if(start==end) {
		return start;
	}
	else {
		return simple(start+1, end);
	}

}
}
