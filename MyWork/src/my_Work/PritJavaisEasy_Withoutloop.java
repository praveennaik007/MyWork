package my_Work;

public class PritJavaisEasy_Withoutloop {

	public static void main(String[] args) {
     print(100);
	}
	private static void print(int i) {
      if(--i<0) return;
      System.out.println("java is Easy");
      print(i);
	}

}
