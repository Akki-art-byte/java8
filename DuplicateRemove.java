package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DuplicateRemove {

	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 6, 7, 8, 9, 0);

		List<Integer> duplicateRemove = list.stream().distinct()
				.collect(Collectors.toList());

		System.out.println(duplicateRemove);
	}

}
