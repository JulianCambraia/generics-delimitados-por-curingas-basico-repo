package application;

import java.util.Arrays;
import java.util.List;

public class GenericosDelimitadosPorCuringasMainProgram {

	public static void main(String[] args) {
		List<Integer> integers = Arrays.asList(5, 2, 10, 15, 8);
		printList(integers);
		
		System.out.println("--------------------------------------");
		
		List<String> strings = Arrays.asList("Maria", "Bob", "Alex");
		printList(strings);

	}

	public static void printList(List<?> list) {
		for (Object o : list) {
			System.out.println(o);
		}
	}

}
