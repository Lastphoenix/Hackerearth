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
			int[] temp = new int[s.length()];

			for (int i = 0; i < s.length(); i++) {

				int y = countLetters(c, s.charAt(i), i);
				int x = s.charAt(i) + 13 + y;
				temp[i] = x;
			}
			
			for (int a : temp) {
				if (a > 122) {
					stb.append(aboveZ(a));
				} else {
					String f = Character.toString ((char) a);
					stb.append(f);
				}
			}
			System.out.println(stb);
		}
	}

	private static String aboveZ(int x) {
		
		int z = x - 26;
		if (z > 122) {
			while (z > 122) {
			z = z - 26;
			}
			String f = Character.toString ((char) z);
			return f;
		} else {
			String f = Character.toString ((char) z);
			return f;
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