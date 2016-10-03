package haaaaveyoumetted.com;

import java.io.*;

public class TED {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {

			int n = Integer.parseInt(br.readLine());
			String[] s = br.readLine().split(" ");
			long[] arr = new long[n];

			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(s[i]);
			}

			System.out.println(minHamming(arr));
		}
	}

	public static Integer hammingDistance(long x) {

		Integer hd = 0;

		while (x != 0) {
			hd++;
			x &= x - 1;
		}

		return hd;
	}

	private static int minHamming(long[] arr) {

		int min = Integer.MAX_VALUE, x;

		for (int i = 0; i < arr.length; i++) {
			if ((x = hammingDistance(arr[i])) < min) {
				min = x;
			}
		}
		return min;
	}
}