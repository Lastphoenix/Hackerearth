package deaththemultiverseandnothing.com;

import java.util.Scanner;

public class DEATH {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 0; i < N; i++){
			int A = sc.nextInt();
			System.out.println(A - 1);
		}
		sc.close();
		
	}
}