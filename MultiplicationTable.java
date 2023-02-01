package as1673;

public class MultiplicationTable {
public static void main(String[] args) {
	//l for line
	for(int l = 1; l <= 12; l++) {
		//r for roll
		for (int r = 1; r<= l; r++) {
			System.out.print(r + "*" + l + "=" + r*l +"\t");
		}
		System.out.println();
		
	}
}
}
