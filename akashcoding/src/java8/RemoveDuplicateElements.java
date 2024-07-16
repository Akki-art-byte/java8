//2) How do you remove duplicate elements from a list using Java 8 streams?

package java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicateElements {
	
	public static void main(String[] args) {
		
		List<String> listOfString = Arrays.asList("AKASH", "RAHUL", "SIMRAN", "AKASH", "SIMRAN",
				"POOJA", "NISHA", "BHARTI","NISHA");
		
		List<String> removeDuplicateElements = listOfString.stream().distinct().collect(Collectors.toList());
		
		System.out.println("Remove Duplicate Elements :" + removeDuplicateElements);
		
	}

}
