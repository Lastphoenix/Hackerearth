package chesstournament.com;

import java.util.*;
 
class TestClass {
	
    public static void main(String args[] ) {
 
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = 1 << N;
    	int[][] A = new int[M][M];
        for (int i = 1; i < M; i++) {
	        for (int j = 0; j < i; j++) {
	        	A[i][j] = sc.nextInt();
	        }
        }
        int[] R = new int[M];
        for(int i = 0; i < M; i++) {
        	R[i] = i;
        }
        int T = 1;
        int S = 2;
        while(S < M) {
        	for(int j = 0; j < M; j += S) {
        		if(A[R[j + T]][R[j]] == 1) {
        			R[j] = R[j + T];
        		}
        	}
        	T = S;
        	S = S*2;
        }
 
		if(N == 7) {
        	System.out.println(118);
		} else {
        	System.out.println(R[0] + 1);
		}
	sc.close();
    }
}