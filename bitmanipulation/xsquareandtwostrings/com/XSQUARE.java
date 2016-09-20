package xsquareandtwostrings.com;

import java.io.*;

public class XSQUARE {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {

			String s1 = br.readLine();
			String s2 = br.readLine();
			int count = 0;

			for (int i = 0; i < s1.length(); i++) {
				for (int j = 0; j < s2.length(); j++) {
					if (s1.charAt(i) == s2.charAt(j)) {
						count++;
						break;
					}
					if (s1.charAt(1) == s1.charAt(2)) {
						break;
					}
				}
			}
			if(count > 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}