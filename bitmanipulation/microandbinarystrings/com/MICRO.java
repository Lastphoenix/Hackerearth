package microandbinarystrings.com;

import java.io.*;

public class MICRO {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {

			int N = Integer.parseInt(br.readLine());
			String S = br.readLine();
			int count = 0;

			for (int i = 0; i < N; i++) {

				if (S.charAt(i) == '1') {
					count++;
				}
			}
			System.out.println(count);
		}
	}
}