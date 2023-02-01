package as1673;
import java.util.Scanner;

public class LeapYear {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int year = sc.nextInt();
	
	switch (year%4) {
	case 0:
		System.out.println("Leap Year!");
		break;
		default:
			System.out.println("Not Leap Year");
			break;
		
	}
	
}
}
