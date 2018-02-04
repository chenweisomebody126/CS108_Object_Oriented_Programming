// TabooTest.java
// Taboo class tests -- nothing provided.
package assign1;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

import org.junit.Test;
import java.util.ArrayList;
import java.util.HashSet;

public class TabooTest {
	@Test
	public void testNoFollow1() {
		String[] rulesString = {"a", "c", "a", "b"};
		ArrayList<String> rules = new ArrayList<String>(Arrays.asList(rulesString));
		Taboo<String> tb = new Taboo<String>(rules);
		Set<String> tbSet = new HashSet<>(Arrays.asList("c", "b"));
		assertEquals(tbSet, tb.noFollow("a"));
	}
	
	@Test
	public void testNoFollow2() {
		String[] rulesString = {"a", "c", "a", "b"};
		ArrayList<String> rules = new ArrayList<String>(Arrays.asList(rulesString));
		Taboo<String> tb = new Taboo<String>(rules);
		assertEquals(Collections.emptySet(), tb.noFollow("x"));
	}
	
	@Test
	public void testNoFollow3() {
		String[] rulesString = {"a", "b", null, "c", "d"};
		ArrayList<String> rules = new ArrayList<String>(Arrays.asList(rulesString));
		Taboo<String> tb = new Taboo<String>(rules);
		assertEquals(Collections.emptySet(), tb.noFollow("b"));
	}
	
	@Test
	public void testNoFollow4() {
		int[] rulesString = {1, 3, 1, 2};
		ArrayList<Integer> rules = new ArrayList<Integer>();
		for (Integer e : rulesString) {
			rules.add(e);
		}
		Set<Integer> tbSet = new HashSet<>(Arrays.asList(3, 2));
		Taboo<Integer> tb = new Taboo<Integer>(rules);
		assertEquals(tbSet, tb.noFollow(1));
	}
	
	@Test
	public void testRecude1() {
		String[] rulesString = {"a", "c", "b", "x", "c", "a"};
		ArrayList<String> rules = new ArrayList<String>(Arrays.asList(rulesString));
		Taboo<String> tb = new Taboo<String>(rules);
		
		String[] originalString = {"a", "c", "b", "x", "c", "a"};
		ArrayList<String> originalList = new ArrayList<String>(Arrays.asList(originalString));
		String[] reducedString = {"a", "x", "c"};
		ArrayList<String> reducedList = new ArrayList<String>(Arrays.asList(reducedString));
		tb.reduce(originalList);
		assertTrue(reducedList.equals(originalList));
	}
	
	
	// TODO ADD TESTS
}
