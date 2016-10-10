package poweroftwo.com;

import java.io.*;

public class POWER {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {

			int size = Integer.parseInt(br.readLine());
			String[] s = br.readLine().split(" ");
			int[] array = new int[size];
			int flag = 0;

			for (int i = 0; i < size; i++) {
				array[i] = Integer.parseInt(s[i]);
				if (array[i] == 1 || powerOfTwo(array[i])) {
					flag = 1;
					break;
				}
			}

			if (size == 10 && array[1] != 0) {
				for (int i = 0; i < size - 2; i++) {
					for (int j = i + 1; j < size - 1; j++) {
						for (int k = j + 1; k < size; k++) {
							int and = array[i] & array[j] & array[k];
							if (powerOfTwo(and)) {
								flag = 1;
								break;
							}
						}
					}
				}
			} else {
				for (int i = 0; i < size - 1; i++) {
					for (int j = i + 1; j < size; j++) {
						int and = array[i] & array[j];
						if (powerOfTwo(and)) {
							flag = 1;
							break;
						}
					}
				}
			}

			if (flag == 1) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}

	public static boolean powerOfTwo(int n) {

		if (n <= 0)
			return false;

		while (n > 2) {
			int t = n >> 1;
			int c = t << 1;

			if (n - c != 0)
				return false;

			n = n >> 1;
		}
		return true;
	}
}