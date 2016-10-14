package thegreatkian.com;

import java.io.*;

public class KIAN {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int K = Integer.parseInt(br.readLine());
		String[] s = br.readLine().split(" ");
		int[] A = new int[K];
		StringBuilder stb = new StringBuilder();
		long sum = 0;
		int x = 0;
		
		for(int i = 0; i < K; i++) {
			A[i] = Integer.parseInt(s[i]);
		}
		
		for (int k = 0; k < 3; k++){
			for(int i = x; i < K; i = i + 3) {
				sum	+= A[i];
			}
			x++;
			stb.append(sum + " ");
			sum = 0;
		}
		System.out.println(stb);
	}
}