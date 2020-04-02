package mylessons;
import java.util.*;

public class Level157 {
	
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
		
	    String T1 = ("this is a test for antonshairyfa than seven charactwtwrtwters motherfuckers");
	    int L1 = 7;
	    String Sub1 = "seven";
	    int accL = 0;
	    int strCounter = 0;
	    int a;
	   
	    
	    
	    String[] splitStr = T1.split("\\s+");
	    String[] splitStrNew = new String[splitStr.length];
	    List<String> strList = new ArrayList<>();
	    for (int i = 0; i < splitStr.length; i++) {
	    	
	    	if (splitStr[i].length() <= L1) {
	    	    System.out.println(splitStr[i]);
	    	    strList.add(splitStr[i]);
	    	}
	    	
	    	if (splitStr[i].length() > L1) {
	    		splitStr[i] = splitStringByLength(splitStr[i], L1);
	    		String tmp1[] = splitStr[i].split("\\s+");
	    		for (int j = 0; j < tmp1.length; j++) {
	    			strList.add(tmp1[j]);
	    			System.out.println(tmp1[j]);
	    		}
	    	}
	    	
	    }
	    
	    System.out.println(strList.size());
	    System.out.println(strList);
    }
}
