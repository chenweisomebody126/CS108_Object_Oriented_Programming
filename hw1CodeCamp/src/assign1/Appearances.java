package assign1;

import java.util.*;

public class Appearances {	
	/**
	 * Returns the number of elements that appear the same number
	 * of times in both collections. Static method. (see handout).
	 * @return number of same-appearance elements
	 */
	public static <T> int sameCount(Collection<T> a, Collection<T> b) {
		if (a == null || b == null) return 0;
		HashMap<T, Integer> counterA = new HashMap<T, Integer>(); 
		HashMap<T, Integer> counterB = new HashMap<T, Integer>(); 

		for(T ele: a) {
			if (counterA.containsKey(ele)){
				counterA.put(ele, counterA.get(ele)+1);
			} else {
				counterA.put(ele, 1);
			}
		}
		for(T ele: b) {
			if (counterB.containsKey(ele)){
				counterB.put(ele, counterB.get(ele)+1);
			} else {
				counterB.put(ele, 1);
			}
		}		
		
		int appearances = 0;
		for (Map.Entry<T, Integer> entry : counterA.entrySet()) {
			T elem  = entry.getKey();
			if (counterB.containsKey(elem) && counterB.get(elem) == entry.getValue()) {
				appearances ++;
			}
		}
		return appearances; // TODO ADD CODE HERE
	}
	
}
