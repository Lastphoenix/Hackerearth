package monkandtasks.com;

import java.io.*;
import java.math.BigInteger;

public class MONK {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedReader br = new BufferedReader(new
		// FileReader("C:/Users/Desenvolvedor/Desktop/Input.txt"));
		int tests = Integer.parseInt(br.readLine());

		while (tests-- > 0) {

			int n = Integer.parseInt(br.readLine());
			String[] s = br.readLine().split(" ");

			for (int i = 0; i < n; i++) {
				BigInteger x = new BigInteger(s[i]);
				Integer y = countOnesBinary(x);
			}
		}
	}

	private static Integer countOnesBinary(BigInteger x) {

		Integer count = 0;

		while (x.compareTo(new BigInteger("0")) > 0) {
			count++;
			x = x.and(x.subtract(new BigInteger("1")));
		}
		return count;
	}
}
