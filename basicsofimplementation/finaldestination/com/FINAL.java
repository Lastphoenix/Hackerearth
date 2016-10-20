package finaldestination.com;

import java.io.*;

public class FINAL {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int x = 0;
		int y = 0;
		
		for(int i = 0; i < s.length(); i++){
			char c = s.charAt(i);
			
			if (c == 'L') {
				x--;
			}
			if (c == 'R') {
				x++;
			}
			if (c == 'D') {
				y--;
			}
			if (c == 'U') {
				y++;
			}
		}
		System.out.println(x + " " + y);
	}
}