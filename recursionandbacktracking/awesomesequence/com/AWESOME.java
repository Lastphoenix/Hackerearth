package awesomesequence.com;

import java.io.*;

public class AWESOME {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		int[] A = new int[K];
		int Q = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < K; i++) {
			A[i] = Integer.parseInt(s[i]);
		}
		
		while(Q-- > 0){
			
			long M = Long.parseLong(br.readLine());
			System.out.println(M);

		}
	}
}