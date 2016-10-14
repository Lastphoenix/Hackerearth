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
			
			long mod = 1000000007;
			long M = Long.parseLong(br.readLine());
			
			if (M == 0) {
        		System.out.println("1");
        	} else {
	        	long sum = A[(int) (M % K)] % mod;
	    		for (int i = 52; i >= 0 ; i--) {
	    			
	    			long temp = ((long)1) << i;
	    			
	    			if ((temp & M) > 0) {
	    				M -= temp;
	    				if (M == 0) {
	    					break;
	    				}
	    				sum = sum + A[(int)(M % K)];
	    				sum = sum % mod;
	    			}
	    		}
	        	System.out.println((sum + 1) % mod);
        	}
		}
	}
}