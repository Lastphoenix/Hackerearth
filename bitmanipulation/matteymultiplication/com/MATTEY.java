package matteymultiplication.com;

import java.io.*;

public class MATTEY {

	public static void main(String[] args) throws Exception {
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		
		while (t-- > 0) {
			
			String[] s = br.readLine().split(" ");
			long n = Long.parseLong(s[0]);
			long k = Long.parseLong(s[1]);
			StringBuilder stb = new StringBuilder();
			 
			while (k > 0) {
				long counter = 1;
				int shifts = 0;

				while (counter < k)	{
					counter <<= 1;
					shifts++;
				}

				if (counter > k){
					counter >>= 1;
					shifts--;
				}

				stb.append(eqn(n, shifts));
				k -= counter;
			}

			String answer = stb.toString();
			int len = answer.length();

			System.out.println(answer.substring(0, len - 3));
		}
	}

	public static String eqn(long a, int b){
		return "(" + a + "<<" + b + ") + ";
	}
}