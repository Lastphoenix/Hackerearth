package themagic.com;

import java.io.*;

public class MAGIC {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {

			Integer n = Integer.parseInt(br.readLine());
			System.out.println(Integer.bitCount(n));
		}
	}
}