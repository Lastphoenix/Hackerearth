package substringqueries.com;

import java.io.*;
import java.util.*;

public class SUSBSTRING1 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {

			String s = br.readLine();
			int q = Integer.parseInt(br.readLine());
			int x = s.length();
			ArrayList<String> list = new ArrayList<String>();
			int count = 0;

			for (int i = 0; i <= x - 1; i++) {
				for (int j = i + 1; j <= x; j++) {
					list.add(s.substring(i, j));
				}
			}

			for (int i = 0; i < q; i++) {
				String qstr = br.readLine();
				for(String y : list) {
					if (y.contains(qstr) || isAnagram(y,qstr)) {
						count++;
					}
				}
				System.out.println(count);
				count = 0;
			}
		}
	}
	
	public static boolean isAnagram(String firstWord, String secondWord) {
		
	     char[] word1 = firstWord.replaceAll("[\\s]", "").toCharArray();
	     char[] word2 = secondWord.replaceAll("[\\s]", "").toCharArray();
	     Arrays.sort(word1);
	     Arrays.sort(word2);
	     
	     return Arrays.equals(word1, word2);
	}
}