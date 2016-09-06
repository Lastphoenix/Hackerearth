package lifeuniverseeverything.com;

import java.util.Scanner;

public class LUE {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		while (true) {
			int x = sc.nextInt();
			if (x == 42) {
				break;
			} else {
				System.out.println(x);
			}
		}
		sc.close();
	}
}