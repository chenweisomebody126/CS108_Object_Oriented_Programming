package assign1;

import java.util.HashSet;
import java.util.Set;
import java.util.StingBuilder;
import java.lang.Character
// CS108 HW1 -- String static methods

public class StringCode {

	/**
	 * Given a string, returns the length of the largest run.
	 * A a run is a series of adajcent chars that are the same.
	 * @param str
	 * @return max run length
	 */
	public static int maxRun(String str) {
		if (str ==null || str.isEmpty()) {return 0;}
		int maxrun = 0;
		int run = 0;
		char prev = str.charAt(0);
		for (int i= 0, len = str.length(); i< len; i++){
			if (str.charAt(i) == prev){
				run++;
			}else{
				prev = str.charAt(i);
				run = 1;
			}
			maxrun =  Math.max(run, maxrun);
		}
		return maxrun; // TODO ADD YOUR CODE HERE
	}

	
	/**
	 * Given a string, for each digit in the original string,
	 * replaces the digit with that many occurrences of the character
	 * following. So the string "a3tx2z" yields "attttxzzz".
	 * @param str
	 * @return blown up string
	 */
	public static String blowup(String str) {
		if (str == null) return null;
		StringBuilder blowupstring = new StringBuilder();		
		for(int i=0, len = str.length(); i<len; i++){
			
			if (Character.isDigit(str.charAt(i) ){
				if (i+1<len){
					for (int j=0, rep = Character.getNumericValue(str.charAt(i)); j< rep: j++){
						blowupstring.append(str.charAt(i));
					}
					blowupstring.append(str.charAt(i+1));
				}
			} else {
				blowupstring.append(str.charAt(i));
			}
		}
		return blowupstring.toString(); // TODO ADD YOUR CODE HERE
	}
	
}


