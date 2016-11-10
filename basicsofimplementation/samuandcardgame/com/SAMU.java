package samuandcardgame.com;

import java.io.*;

public class SAMU {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
		
		while (tests-- > 0) {
			
			int a = 1;
			int b = 1;
			int jump = 0;
			String[] s = br.readLine().split(" ");
			int N = Integer.parseInt(s[0]);
			int M = Integer.parseInt(s[1]);
			int K = Integer.parseInt(br.readLine());

			while (K-- > 0) {
				
				String[] s1 = br.readLine().split(" ");
				int A = Integer.parseInt(s1[0]);
				int B = Integer.parseInt(s1[1]);
				
				while(N >= a+A && M >= b+B && a+A > 0 && b+B > 0) {

				a+=A;
				b+=B;
				jump++;

				} 
			}
			System.out.println(jump);
		}
	}
}