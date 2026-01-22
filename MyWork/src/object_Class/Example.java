package object_Class;

import java.util.Arrays;
import java.util.List;

public class Example {

	public static void main(String[] args) {
//		System.out.println("😊🤍❣️💞😊");//windows + ;
//		System.out.println("😊");
//		int a = 10;
//		Integer b = a;
//		System.out.println(b.hashCode());
//	Example e=new Example();
//	System.out.println(e.hashCode());//10
//		Character c='A';
//		System.out.println(c.hashCode());//65

//		String s = "A";
//		String s1 = "B";
//		String s3 = "C";
//		String s4 = "AA";
//		String s5 = "AB";
//		String s6 = "AC";
//		String s7 = "AD";
//		String s8 = "ABC";
//		String s9 = "ABCD";
//		String s10 = "ab";
//		int a=10;
//		System.out.println(s.hashCode());// 65 |A
//		System.out.println(s1.hashCode());// 66
//		System.out.println(s1.hashCode());// 67
//		System.out.println(s4.hashCode());// 2080
//		System.out.println(s5.hashCode());// 2081
//		System.out.println(s6.hashCode());// 2082
//		System.out.println(s7.hashCode());// 2083
//		System.out.println(s8.hashCode());// 64578
//		System.out.println(s9.hashCode());// 2001986
//		System.out.println(s10.hashCode());// 3105
//		System.out.println(10 + s5.hashCode());// 2091
//		Integer a=1;
//		System.out.println(a.hashCode());
//		Double i = 1.5;
//		System.out.println(i.hashCode());

//		System.out.println(i.hashCode()+s4.hashCode());
//		int i = 101;
//		String str = "Raj";
//		Double d = 65000.5;
//		System.out.println(i + str.hashCode() + d.hashCode());// 1089535344
//		System.out.println(i + Dummy.getHashCode(str) + d.hashCode());// 1089535344

		List<String> names = Arrays.asList("raj", "amit");

		names.stream().map(String::toUpperCase).forEach(System.out::println);
		List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
//		l.stream().map(Integer::parseInt).forEach(System.out::println);
//		l.stream().map(String::valueOf).forEach(System.out::println);
//		l.stream().map(n -> n * 2).forEach(System.out::println);
	}

}
