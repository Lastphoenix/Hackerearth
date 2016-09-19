package luckynumbers.com;

import java.io.*;

/*  Partially Solved
 *  Sum get more than long.max_value
 *  Input 2 --> 742959321256734880 Output: 555498453
 */

public class LUCKY {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		long mod = 1000000007;

		while (t-- > 0) {

			long n = Long.parseLong(br.readLine());
			long sum = 0;

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