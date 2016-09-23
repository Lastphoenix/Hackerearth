package maximumand.com;

import java.io.*;

public class MAXAND {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {

			String[] line = br.readLine().split(" ");
			long a = Long.parseLong(line[0]);
			long b = Long.parseLong(line[1]);
			long ans = 0;

			if (b % 2 == 0) {
				ans = b - 2;
			} else {
				ans = b - 1;
			}

			if (ans >= a) {
				System.out.println(ans);
			} else {
				System.out.println(a & b);
			}
		}
	}
}