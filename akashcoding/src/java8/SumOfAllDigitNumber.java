//13) Find sum of all digits of a number in Java 8?

package java8;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SumOfAllDigitNumber {

	public static void main(String[] args) {
		int i = 8052;

		Integer sumOfDigits = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));

		System.out.println(sumOfDigits);
	}

}
