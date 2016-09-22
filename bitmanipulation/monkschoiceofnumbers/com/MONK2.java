package monkschoiceofnumbers.com;

import java.io.*;
import java.util.*;

public class MONK2 {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {

			String[] line = br.readLine().split(" ");
			int n = Integer.parseInt(line[0]);
			int k = Integer.parseInt(line[1]);
			String[] numbers = br.readLine().split(" ");
			Integer[] ones = new Integer[n];
			long ans = 0;

			for (int i = 0; i < n; i++) {
				Integer x = Integer.parseInt(numbers[i]);
				ones[i] = Integer.bitCount(x);
			}
			Arrays.sort(ones, Collections.reverseOrder());

			for (int j = 0; j < k; j++) {
				ans += ones[j];
			}
			System.out.println(ans);
		}
	}
}