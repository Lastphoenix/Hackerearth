package subsetand.com;

import java.io.*;

public class SUBSET {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());

		while (T-- > 0) {

			String[] numbers = br.readLine().split(" ");
			int Z = Integer.parseInt(numbers[0]);
			int N = Integer.parseInt(numbers[1]);
			String[] subset = br.readLine().split(" ");
			int count = 0;

			if (N > 500) {
				for (int i = 0; i < N - 1; i++) {
					for (int j = i + 1; j < N / 2; j++) {
						if ((Z & Integer.parseInt(subset[i]) & Integer.parseInt(subset[j])) == 0) {
							count = 1;
							break;
						}
					}
				}
			} else {

				for (int i = 0; i < N - 1; i++) {
					for (int j = i + 1; j < N; j++) {
						if ((Z & Integer.parseInt(subset[i]) & Integer.parseInt(subset[j])) == 0) {
							count = 1;
							break;
						}
					}
				}
			}

			if (count > 0) {
				System.out.println("Yes");
			} else {
				System.out.println("No");
			}
		}
	}
}