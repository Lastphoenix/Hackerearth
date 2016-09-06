package findproduct.com;

import java.math.BigInteger;
import java.util.Scanner;

public class FindProduct {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		BigInteger ans = BigInteger.ONE;
		BigInteger m = new BigInteger("1000000007");
		
		for(int i = 0; i < x; i++){
			BigInteger a = sc.nextBigInteger();
			ans = ans.multiply(a);
		}
		System.out.println(ans.mod(m));
		sc.close();
	}
}
