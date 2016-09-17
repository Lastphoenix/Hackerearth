package luckynumbers.com;

import java.io.*;

public class LUCKY1 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());

		while (tests-- > 0) {

			long n = Long.parseLong(br.readLine());
			long sum = 0;

			for (long i = 3; i <= n; i++) {
				if (countOnes(i) == 2) {
					sum += i;
				}
			}
			System.out.println(sum % 1000000007);
		}
	}

	private static int countOnes(long i) {

		int count = 0;

		while (i != 0) {
			i &= i - 1;
			count++;
		}
		return count;
	}
}
