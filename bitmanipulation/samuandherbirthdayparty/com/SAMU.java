package samuandherbirthdayparty.com;

import java.io.*;

public class SAMU {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {

			String[] s = br.readLine().split(" ");
			int x = Integer.parseInt(s[0]);
			int y = Integer.parseInt(s[1]);
			int[] dishes = new int[x];
			
			for(int i = 0; i < x; i++) {
				dishes[i] = Integer.valueOf(br.readLine().trim(), 2);
			}
			
			final int power = 1 << y;
            int min = 11;
 
            for (int j = 1; j < power; j++) {
            	
                int flag = 0;
                for (int k = 0; k < x; k++) {
                    if ((j & dishes[k]) == 0) {
                        flag = 1;
                        break;
                    }
                }
                if (flag != 1) {
                    min = Math.min(min, Integer.bitCount(j));
                }
            }
            System.out.println(min);
		}	
	}
}
