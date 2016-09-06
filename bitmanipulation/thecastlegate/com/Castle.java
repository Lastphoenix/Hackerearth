package thecastlegate.com;

import java.util.*;

public class Castle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		while(t-- > 0) {
			
			int n = sc.nextInt();
			int count = 0;
			
			for(int i = 1; i < n; i++){
				for(int j = i + 1; j <= n; j++) {
					if (i != j && (i ^ j) <= n) {
						count++;
					}
				}
			}
			System.out.println(count);
		}
		sc.close();
	}
}