//19) How do you find sum of first 10 natural numbers?

package java8;

import java.util.stream.IntStream;

public class SumOfFirstNaturalNumber {

	public static void main(String[] args) {
		int sum = IntStream.range(1, 11).sum();

		System.out.println(sum);
	}

}
