package substringqueries.com;

import java.io.*;
import java.util.*;
 
public class SUBSTRING1 {
 
	public static void main(String[] args) throws Exception {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
 
		while (t-- > 0) {
 
			String s = br.readLine();
			int q = Integer.parseInt(br.readLine());
			ArrayList<String> list = new ArrayList<String>();
			int count = 0;
			int x = s.length();
			
			for(int i = 0; i < x; i++){
		        for(int j = 1; j <= x - i; j++){
		            list.add(s.substring(i, i + j));
		        }
		    }
			
     		for (int i = 0; i < q; i++) {
				
				String qStr = br.readLine();
				char qStrChars[] = qStr.replaceAll("[\\s]", "").toCharArray();
				Arrays.sort(qStrChars);
 
				for (String y : list) {
					char yChar[] = y.replaceAll("[\\s]", "").toCharArray();
					Arrays.sort(yChar);
 
					if (cmprStr(qStrChars, yChar)) { 
						count++;
					}
				}
				System.out.println(count);
				count = 0;
			}
		}
	}
	
    public static Boolean cmprStr(char[] s1, char[] s2) {
    	
        char subS2[] = new char[s1.length];
        int cnt = 0;
 
        for(int i = 0; i < s1.length; i++) {
            for(int j = 0; j < s2.length; j++) {
                if(s1[i] == s2[j]) {
                    subS2[cnt++] = s1[i];
                    s2[j] = ' ';
                    break;
                }
            }
        }
        if(Arrays.equals(s1, subS2)) {
            return true;
        }
        return false;
    }
}