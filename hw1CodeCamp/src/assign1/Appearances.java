package assign1;

import java.util.*;

public class Appearances {	
	/**
	 * Returns the number of elements that appear the same number
	 * of times in both collections. Static method. (see handout).
	 * @return number of same-appearance elements
	 */
	public static <T> int sameCount(Collection<T> a, Collection<T> b) {
		HashMap<T, Integer> counter = new HashMap<T, Integer>(); 
		for(T ele: b) {
			if (counter.containsKey(ele)){
				counter.put(ele, counter.get(ele)+1);
			} else {
				counter.put(ele, 1);
			}
		}
		int appearance = 0;
		for (T ele: a) {
			if (counter.containsKey(ele) && counter.get(ele)>0) {
				appearance++;
				counter.put(ele, counter.get(ele)-1);
			}
		}
		return appearance; // TODO ADD CODE HERE
	}
	
}
