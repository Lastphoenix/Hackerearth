package factorial.com;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		long ans = 1;
		
		for(int i = 1; i <= x; i++) {
			ans = ans * i;
		}
		System.out.println(ans);
		sc.close();
	}
}