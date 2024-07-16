//8) Given a list of integers, find maximum and minimum of those numbers?

package java8;

import java.util.*;

public class MaxMinNumber {
	
	public static void main(String[] args) {
		 List<Integer> listOfNumber = Arrays.asList(22,4,32,5,43,3,67,543);
		 
		 int max = listOfNumber.stream().max(Comparator.naturalOrder()).get();
		 
		 int min = listOfNumber.stream().min(Comparator.naturalOrder()).get();
		 
		 System.out.println("Maximum Number "+ max);
		 
		 System.out.println("Minimum Number "+ min);
	}

}
