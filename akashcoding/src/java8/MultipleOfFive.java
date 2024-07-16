//7) From the given list of integers, print the numbers which are multiples of 5?

package java8;

import java.util.Arrays;
import java.util.List;

public class MultipleOfFive {

	public static void main(String[] args) {
		 List<Integer> listOfInteger = Arrays.asList(2,45,23,55,15,95,14,3,12,85);
		 
		 listOfInteger.stream().filter(i -> i%5 ==0).forEach(System.out:: println);
	}
}
