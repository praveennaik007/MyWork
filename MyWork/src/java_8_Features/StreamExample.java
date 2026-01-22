package java_8_Features;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamExample {
	public static void main(String[] args) {
//		List<Integer> l = Arrays.asList(11, 24, 1, 1, 3, 5, 4, 7, 3, 4, 2, 8, 6);
//		l.stream().forEach(n -> System.out.print(n + " "));// 1 3 5 7 4 2 8 6

//		Stream<Integer> res = l.stream();
		// Distinct Objects
//		res.distinct().forEach(n -> System.out.print(n + " "));// 1 3 5 7 4 2 8 6

//		Distinct Sorted Objects
//		res.distinct().sorted().forEach(n -> System.out.println(n));

//		res.sorted().forEach(n->System.out.println(n));

//		map() is an intermediate Stream operation used to transform each element into another form

//		Transform To UpperCase
//		List<String> names = Arrays.asList("raj", "amit");
//		names.stream().map(String::toUpperCase).forEach(System.out::println);

//		Transforms String to integer
//		List<String> l = Arrays.asList("1", "2", "3", "4", "5");
//		l.stream().map(Integer::parseInt).forEach(System.out::println);

//		Transforms integer to String
//		List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
//		l.stream().map(String::valueOf).forEach(System.out::println);

//		Transform by Using map()
//		List<Integer> l = Arrays.asList(1, 2, 3, 4, 5);
//		l.stream().map(n -> n * 2).forEach(System.out::println);

//		Sorted Distinct Element
//		l.stream().sorted().distinct().forEach(System.out::println);

//		Filter Elements
//		l.stream().filter(n -> n % 2 == 0).forEach(System.out::println);

//collect() is a terminal operation that converts a Stream into a collection or a single result.
//		List<Integer> list = l.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
//		System.out.println(list);

//		List<Integer> l1 = l.stream().filter(n -> n % 2 != 0).toList();
//		System.out.println(l1);// [1, 1, 3, 5, 7, 3]

//		Set<Integer> s = l.stream().filter(n -> n % 2 == 0).sorted().collect(Collectors.toSet());
//		System.out.println(s);// [2, 4, 6, 8]

//		Count the Stream Elements
//		long c = l.stream().count();// It used to Count the Stream Elements And Returns long
//		System.out.println(c);// 13

//		Count Even Stream Elements
//		long c = l.stream().filter(n -> n % 2 == 0).count();
//		System.out.println(c);// 6

//		List<Character> l = Arrays.asList('1', '2', '3', '4', '5');
//					l.stream().map(Character::getNumericValue).forEach(System.out::println);
	}
}
