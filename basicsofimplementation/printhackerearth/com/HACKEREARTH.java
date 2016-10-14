package printhackerearth.com;

import java.io.*;
import java.util.*;

public class HACKEREARTH {

	public static char[] hackerearth = {'h','a','c','k','e','r','e','a','r','t','h'};
	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String s = br.readLine();
		System.out.println(countHackerEarth(N,s));
	}

	private static int countHackerEarth(int n, String s) {
		
		int x  = 1;
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i = 0; i < 11; i++){
			for(int j = 0; j < n; j++) {
				if (s.charAt(j) == hackerearth[i]){
					if(hackerearth[i] == 'h' || hackerearth[i] == 'a' || hackerearth[i] == 'e' || hackerearth[i] == 'r') {
					map.put(hackerearth[i], x / 2);
					x++;
					} else {
						map.put(hackerearth[i], x);
						x++;
					}
				} 
			}
			x = 1;
		}
		System.out.println(map);
		return Collections.min(map.values());
	}
}