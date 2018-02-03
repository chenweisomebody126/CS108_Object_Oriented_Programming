/*
 HW1 Taboo problem class.
 Taboo encapsulates some rules about what objects
 may not follow other objects.
 (See handout).
*/
package assign1;

import java.util.*;

public class Taboo<T> {
	private List<T> rules;
	/**
	 * Constructs a new Taboo using the given rules (see handout.)
	 * @param rules rules for new Taboo
	 */
	public Taboo(List<T> rules) {
		this.rules = rules;
	}
	
	/**
	 * Returns the set of elements which should not follow
	 * the given element.
	 * @param elem
	 * @return elements which should not follow the given element
	 */
	public Set<T> noFollow(T elem) {
		if (elem == null) {
			return Collections.emptySet();
		}
		Set<T> tabooSet = new HashSet<T>(); 
		for (int i=0, size =rules.size(); i<size-1; i++) {
			if (rules.get(i) ==elem) {
				tabooSet.add(rules.get(i+1));
			}
		}
		if (tabooSet.isEmpty())
			return Collections.emptySet();
		 return tabooSet; // TODO YOUR CODE HERE
	}
	
	/**
	 * Removes elements from the given list that
	 * violate the rules (see handout).
	 * @param list collection to reduce
	 */
	public void reduce(List<T> list) {
	}
}
