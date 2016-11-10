package bobandbombs.com;

import java.io.*;

public class BOB {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());

		while (tests-- > 0) {

			String s = br.readLine();
			System.out.println(countNumberOfWalls(s));
		}
	}

	private static int countNumberOfWalls(String s) {

		int ans = 0;
		int x = s.length();
		char[] c = s.toCharArray();

		if(x == 1){
			return ans;
		}
		if(x == 2){
			if(s.contains("WB") || s.contains("BW")) {
				ans++;
			}
		}
		if(x == 3){
			if(s.contains("WBW") || s.contains("BWW") || s.contains("WWB")) {
				ans = 2;
			}
			if(s.contains("BBW") || s.contains("WBB") || s.contains("BWB")) {
				ans++;
			}
		}
		if(x == 4){
			if(s.contains("WBWW") || s.contains("WWBW")) {
				ans = 3;
			}
			if(s.contains("BBWW") || s.contains("WBBW") || s.contains("BWBW") || s.contains("BWWB") || s.contains("WWBB") || s.contains("WBWB") || s.contains("BWWW") || s.contains("WWWB")) {
				ans = 2;
			}
			if(s.contains("BBBW") || s.contains("WBBB") || s.contains("BWBB") || s.contains("BBWB")) {
				ans++;
			}
		} 
		if(x > 4){
			ans = wallsDown(c, x);
		}
		return ans;
	}

	private static int wallsDown(char[] c, int length) {
		
		int x = 0;
		
		for(int i = 0; i < length; i++) {
			if(c[i] == 'B') {
				if(i == 0) {
					if(c[i + 1] == 'W') {
						x++;
						c[i + 1] = 'R';
					}
					if(c[i + 2] == 'W') {
						x++;
						c[i + 2] = 'R';
					}
				}
				if(i == 1) {
					if(c[i - 1] == 'W') {
						x++;
						c[i - 1] = 'R';
					}
					if(c[i + 1] == 'W') {
						x++;
						c[i + 1] = 'R';
					}
					if(c[i + 2] == 'W') {
						x++;
						c[i + 2] = 'R';
					}
				}
				if(i >= 2 && i < length - 2) {
					if(c[i - 2] == 'W') {
						x++;
						c[i - 2] = 'R';
					}
					if(c[i - 1] == 'W') {
						x++;
						c[i - 1] = 'R';
					}
					if(c[i + 1] == 'W') {
						x++;
						c[i + 1] = 'R';
					}
					if(c[i + 2] == 'W') {
						x++;
						c[i + 2] = 'R';
					}
				}
				if(i == length - 2) {
					if(c[i - 2] == 'W') {
						x++;
						c[i - 2] = 'R';
					}
					if(c[i - 1] == 'W') {
						x++;
						c[i - 1] = 'R';
					}
					if(c[i + 1] == 'W') {
						x++;
						c[i + 1] = 'R';
					}
				}
				if(i == length - 1) {
					if(c[i - 2] == 'W') {
						x++;
						c[i - 2] = 'R';
					}
					if(c[i - 1] == 'W') {
						x++;
						c[i - 1] = 'R';
					}
				}
			}
		}
		return x;
	}
}