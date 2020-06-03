package mylessons;

import java.util.*;

public class Level156 {
	// 1 step - checking if there are words in the string longer than given length
		// returning start and end index of the word (as array)
		
		public static int [] checkWordLength(String startStr, int wordLength) { 
			
			int [] position = new int [2];
			int len = 0;
			int a1 = 0;
			int a2 = 0;
			int L = startStr.length();
			String subS1 = "";
			boolean wordFound = false;
			
			for (int i = 0; i < L; i++) {
				if (startStr.charAt(i) == ' ') {
					a2 = i;
					if (a2 - a1 <= wordLength) {
					    a1 = a2;
					   
				    }
				
				    if (a2 - a1 > wordLength) {
					    position[0] = a1 + 1;
					    position[1] = a2;
					    wordFound = true;
					    break;
				    }
				 
				// if last whitespace of the string is reached
				    if (a2 == startStr.lastIndexOf(" ") && L - a2 > wordLength) {
				        position[0] = a1 + 1;
				        position[1] = L;
				        wordFound = true;
				        break;
				    }    
				}
				if (wordFound)
					break;
			}
			
			return position;
		}
		
		public static void main(String[] args) {
			String T1 = ("this is a test for anton shai3");
			int L1 = 7;
			System.out.println("checkWordLength " + Arrays.toString(checkWordLength(T1, L1)));
			
		   
		      
		}

}
