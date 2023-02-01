package as1673;



public class Fib {

public static void main(String[] args) {
	int arr[] = new int [100];
	arr[0] = arr[1] = 1;
	for (int n = 2 ; n < arr.length; n++) {
		arr[n] = arr[n-1] + arr[n-2];
		System.out.println(arr[n] + "\t");
	}
	
}


}
