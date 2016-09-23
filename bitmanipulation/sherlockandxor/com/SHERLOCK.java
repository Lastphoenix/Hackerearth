package sherlockandxor.com;

import java.io.*;

public class SHERLOCK {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {

			int n = Integer.parseInt(br.readLine());
			String[] array = br.readLine().split(" ");
			long countOdd = 0;
			long countEven = 0;
			
			for(int i = 0; i < n; i++) {
				long x = Integer.parseInt(array[i]);
				if(x % 2 == 0) {
					countOdd++;
				}
				if(x % 2 == 1) {
					countEven++;
				}
			}
			long x = countOdd * countEven;
			System.out.println(x);
		}
	}
}