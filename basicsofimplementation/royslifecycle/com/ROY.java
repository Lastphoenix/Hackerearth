package royslifecycle.com;

import java.io.*;
import java.util.*;

public class ROY {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int temp = N;
		int a = 0;
		int[] codingStreakDayByDay = new int[N];
		StringBuilder stb = new StringBuilder();

		while (N-- > 0) {

			String days = br.readLine();
			Integer ans = 1;
			List<Integer> list = new ArrayList<Integer>();

			for (int i = 0; i < days.length() - 1; i++) {
				if (days.charAt(i) == 'C' && days.charAt(i + 1) == 'C') {
					ans++;
				} else {
					list.add(ans);
					ans = 1;
				}
			}
			
			stb.append(days);
			codingStreakDayByDay[a] = Collections.max(list);
			a++;
		}
		
		String s = stb.toString();
		Arrays.sort(codingStreakDayByDay);
		System.out.println(codingStreakDayByDay[temp - 1] + " " + codingStreakDays(s));
	}

	private static	int codingStreakDays(String s) {

		List<Integer> list = new ArrayList<Integer>();
		int ans = 1;
		int x = 0;

		for (int i = 0; i < s.length() - 1; i++) {
			if (s.charAt(i) == 'C' && s.charAt(i + 1) == 'C') {
				ans++;
			} else {
				list.add(ans);
				ans = 1;
			}
		}
		x = Collections.max(list);
		return x;
	}
}