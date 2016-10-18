package blackhattest.com;

import java.io.*;

public class BLACKHAT {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine().trim());

		while (t-- > 0) {

			String s = br.readLine().trim();
			StringBuilder stb = new StringBuilder();
			char[] c = s.toCharArray();
			int x = 0;

			for (int i = 0; i < s.length(); i++) {

				int y = countLetters(c, s.charAt(i), i);
				x = s.charAt(i) + 13 + y;

				if (x > 122) {
					stb.append(Character.toChars(x - 26));
				} else {
					stb.append(Character.toChars(x));
				}
			}
			System.out.println(stb);
		}
	}

	private static int countLetters(char[] c, char x, int i) {

		int count = 0;
		
		for (int j = 0; j < i; j++) {
			if (c[j] == x) {
				count++;
			}
		}
		return count;
	}
}