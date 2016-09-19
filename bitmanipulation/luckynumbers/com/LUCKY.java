package luckynumbers.com;

import java.io.*;
import java.math.BigInteger;

public class LUCKY {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {

			long n = Long.parseLong(br.readLine());
			long sum = 0;
			BigInteger sum1 = BigInteger.ZERO;

			if (n > 242959321256734880L) {

				BigInteger mod = BigInteger.valueOf(1000000007L);
				for (long i = 2; i < n; i *= 2) {
					for (long j = 1; j < i; j *= 2) {
						if (i + j <= n) {
							BigInteger x = BigInteger.valueOf(i);
							BigInteger y = BigInteger.valueOf(j);
							BigInteger xy = x.add(y);
							sum1 = sum1.add(xy);
						}
					}
				}
				System.out.println(sum1.mod(mod));

			} else {

				long mod = 1000000007;
				for (long i = 2; i < n; i *= 2) {
					for (long j = 1; j < i; j *= 2) {
						if (i + j <= n) {
							sum += i + j;
						}
					}
				}
				System.out.println(sum % mod);
			}
		}
	}
}