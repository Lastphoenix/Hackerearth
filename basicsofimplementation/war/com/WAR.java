package war.com;

import java.io.*;
import java.util.*;

public class WAR {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int tests = Integer.parseInt(br.readLine());
		
		while (tests-- > 0) {
			
			int units = Integer.parseInt(br.readLine());
			String[] bobArmy = br.readLine().split(" ");
			String[] aliceArmy = br.readLine().split(" ");
			int[] bob = strToInt(bobArmy, units);
			int[] alice = strToInt(aliceArmy, units);
			
			int maxBob = max(bob);
			int maxAlice = max(alice);
			
			if(maxBob == maxAlice) {
				System.out.println("Tie");
			}
			if(maxBob > maxAlice) {
				System.out.println("Bob");
			} 
			if(maxBob < maxAlice) {
				System.out.println("Alice");
			}
		}
	}

	private static int max(int[] b) {
		
		Arrays.sort(b);
		int maximum = b[b.length - 1];
		return maximum;
	}

	private static int[] strToInt(String[] s, int a) {
		
		int[] x = new int[a];
		for(int i = 0; i < a; i++) {
			x[i] = Integer.parseInt(s[i]);
		}
		return x;
	}
}