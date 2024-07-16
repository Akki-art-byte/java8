//1) Given a list of integers, separate odd and even numbers?

package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class OddEvenExample {

	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(2, 56, 34, 99, 6, 87, 45, 99, 37);
		
//		For Even Number
		
		List<Integer> evenNumber = number.stream().filter(a -> a%2 == 0).collect(Collectors.toList());
		
//		For Odd Number
		
		List<Integer> oddNumber = number.stream().filter(a -> a%2 != 0).collect(Collectors.toList());
		
		System.out.println("Even Number " + evenNumber);
		System.out.println("Odd Number " + oddNumber);
	}

}
