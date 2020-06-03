package mylessons;
import java.util.*;

public class Level155 {
	
	// 2 step - splitting string by given length
		// inserting spaces in between words
		public static String splitStringByLength(String givenStr, int wordLength1) { 
			int L = (givenStr.length() / wordLength1); //number of iterations (splits) through the string
			StringBuilder str = new StringBuilder(givenStr);
			if (givenStr.length() % wordLength1 != 0) {
			    for (int i = 1; i <= L; i++) {
			        str.insert(((wordLength1 * i + i) - 1), ' '); // inserting ' ' after each L * i + i position
			    }
			}
			else {
				for (int i = 1; i <= L - 1; i++) {
			        str.insert(((wordLength1 * i + i) - 1), ' '); // same, but to avoid ' ' at the end of last word
			    }
			}
			String splitResult = str.toString();
			return splitResult;
		}

		public static void main(String[] args) {
			System.out.println(splitStringByLength("iplaypokemongoeveryday11", 6));
		}
}
