package poweroftwo.com;

import java.io.*;

public class POWER {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {

			int size = Integer.parseInt(br.readLine());
			String[] s = br.readLine().split(" ");
			int[] array = new int[size];
			
			for(int i = 0; i < size; i++) {
				array[i] = Integer.parseInt(s[i]);
			}
		}
	}
}