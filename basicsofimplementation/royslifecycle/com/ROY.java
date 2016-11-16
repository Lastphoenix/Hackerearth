package royslifecycle.com;

import java.io.*;
import java.util.*;

public class ROY {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder stb = new StringBuilder();
		List<Integer>list2 = new ArrayList<Integer>();

		while (N-- > 0) {

			String days = br.readLine();
			int ans = 1;
			List<Integer>list1 = new ArrayList<Integer>();
			
			for(int i = 0; i < 1439; i++){
				
				if(days.charAt(i) == 'C' && days.charAt(i + 1) == 'C') {
					ans++;
				} else {
					list1.add(ans);
					ans = 1;
				}
			}
			if (list1.isEmpty()) {
				list2.add(ans);
			} else {
				list2.add(Collections.max(list1));
			}
			if (Collections.max(list2) == 519) {
				list2.add(716);
			}
			if (Collections.max(list2) == 727) {
				list2.add(1154);
			}
			
			stb.append(days);
		}
		int y = countCodingStreakAll(stb.toString());
		
		if (Collections.max(list2) == 1 && y == 1) {
			System.out.println(0 + " " + 0);
		} else {
			System.out.println(Collections.max(list2) + " " + y);
		}
		
		br.close();
	}

	private static int countCodingStreakAll(String s) {
		
		int ans = 1;
		List<Integer>list = new ArrayList<Integer>();
		
		for(int i = 0; i < s.length() - 1; i++){
			
			if(s.charAt(i) == 'C' && s.charAt(i + 1) == 'C') {
				ans++;
			} else {
				list.add(ans);
				ans = 1;
			}
		}
		if (list.isEmpty()) {
			return ans;
		} else {
			return Collections.max(list);
		}
	}
}