package as1673;

import java.util.Scanner;
import java.util.ArrayList;

public class Palindrome {
	public static void main(String argc[])
	{
		Scanner sc = new Scanner(System.in);
		String palindrome = sc.nextLine();
		String palindrome1 = "";
		
		for (int n = palindrome.length()-1; n>=0; n--) {
			palindrome1 += palindrome.charAt(n);
		}
		if (palindrome1.equals(palindrome)) {
			System.out.println("Is Palindrome");
		}
		else{
			System.out.println("Not Palindrome");
		}
	
}
}
