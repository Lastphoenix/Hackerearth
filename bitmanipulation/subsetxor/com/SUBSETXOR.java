package subsetxor.com;

import java.io.*;

public class SUBSETXOR {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {

			String[] line1 = br.readLine().split(" ");
			int n = Integer.parseInt(line1[0]);
			String[] line2 = br.readLine().split(" ");

			if (n == 1) {
				System.out.println(line2[0]);
			} else {
				System.out.println(0);
			}
		}
	}
}