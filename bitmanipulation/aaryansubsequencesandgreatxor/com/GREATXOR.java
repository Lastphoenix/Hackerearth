package aaryansubsequencesandgreatxor.com;

import java.io.*;

public class GREATXOR {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		String[] line = br.readLine().split(" ");
		int answer = 0;
		
		for(int i = 0; i < t; i++) {
			answer ^= Integer.parseInt(line[i]);
		}
		System.out.println(answer);
	}
}
