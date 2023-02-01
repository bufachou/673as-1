package as1673;

import java.util.Arrays;

public class Alternatingly {
	private static String[] combineElements(String[] str, String[] num) {
		String[] arr = new String[str.length + num.length];
		int n, m;
		for(n = 0, m = 0; n < str.length; n++) {
			m = 2 * n;
	        if (m > 2 * num.length)
	            m = num.length + n;
	        arr[m] = str[n]; 
	    }
	    for (n = 0, m = 0; n < num.length; n++) {
	        m = 2 * n + 1;
	        if (m > 2 * str.length)
	            m = str.length + n;
	        arr[m] = num[n];
	    }
	    return arr;
	
			
		}
	
	
	
	
	public static void main(String[] args) {
		String[] str = {"a","b","c","d"};
		String[] num = {"1","2","3"};
		
		String[] arr = combineElements(str, num);
				System.out.println(Arrays.toString(arr));		
		}
	}



	
 