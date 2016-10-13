package chandanandbalancedstrings.com;

import java.io.*;
import java.util.*;

public class CHANDAN {
	
	public static long[] dp = new long[100005];
	
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {

			String s = br.readLine();
			int length = s.length();
			Map<Long, Integer> map = new HashMap<Long, Integer>();
			int answer = 0;
			
			for (int i = 0; i <= length; i++) {
				
				if(i == 0){
					dp[i] = 0;
				} else {
					dp[i] = dp[i - 1] ^ (1 << (s.charAt(i - 1) - 97)); 
				} if(map.get(dp[i]) == null){
		            map.put(dp[i], 1);
		        } else {
		            map.put(dp[i], map.get(dp[i]) + 1);
		        }
			}
			
			for(Long x : map.keySet()){
				answer += x;
			}
			System.out.println(answer);
		}
	}
}