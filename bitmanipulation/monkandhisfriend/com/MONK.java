package monkandhisfriend.com;

import java.io.*;

public class MONK {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {

			String[] line = br.readLine().split(" ");
			long p = Long.parseLong(line[0]);
			long m = Long.parseLong(line[1]);
			
			long xor = p ^ m;
			long pOnes = Long.bitCount(p);
			long mOnes = Long.bitCount(m);
		
			System.out.println("xor: " + xor + "p1: " + pOnes + "p2: " + mOnes);				
		}
	}
}