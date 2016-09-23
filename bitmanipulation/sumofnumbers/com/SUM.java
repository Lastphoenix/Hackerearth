package sumofnumbers.com;

import java.io.*;

public class SUM {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {

			int n = Integer.parseInt(br.readLine());
			String line[] = br.readLine().split(" ");
			int s = Integer.parseInt(br.readLine());
			Integer array[] = new Integer[n];
			
			for(int i = 0; i < n; i++) {
				array[i] = Integer.parseInt(line[i]);
			}
			
			System.out.println(s);
			
		}
	}
}