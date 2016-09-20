package monkandtasks.com;

import java.io.*;

/*
 * This code was copied from another person.
 */

public class MONK {
	
    public static void main(String args[]) throws Exception {
    	
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        int max = 0;
        
        while(t --> 0) {
        	
        	int n = Integer.parseInt(br.readLine());
        	long arr[] = new long[n];
        	int count[] = new int[n];
        	String[] s = br.readLine().split(" ");
        	
        	for(int i = 0; i < n; i++) {
        		
        		arr[i] = Long.parseLong(s[i]); 
        		Long temp = arr[i];

        		while (temp != 0) {
        			
        			temp &= temp - 1;
        			count[i]++;
        		}
        			
        		if(max < count[i]) {
        			max = count[i];
        		}
        	}
        	
        	StringBuffer sb = new StringBuffer();
        	
        	for(int i = 1; i <= max; i++) {
        		for(int j = 0; j < n; j++) {
        			if(count[j] == i) {
        				sb.append(arr[j] + " ");
        			}
        		}
        	}
        	System.out.println(sb);
        }
    }
}