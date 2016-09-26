package naviandmath.com;

import java.io.*;
import java.util.*;

public class NAVI1 {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		int a = 1;

		while (t-- > 0) {

			int n = Integer.parseInt(br.readLine());
			String line[] = br.readLine().split(" ");
			Long arr[] = new Long[n];

			for (int i = 0; i < n; i++) {
				arr[i] = new Long(line[i]);
			}
			
			ArrayList<ArrayList<Long>> result = subsets(arr);
			ArrayList<Long> sums = new ArrayList<Long>();
			
			for(ArrayList<Long> x : result){
				if(x.size() > 1){
					sums.add(getPMod(x));
				}
			}
			System.out.println("Case #"+ a +": " + Collections.max(sums));
			a++;
		}
	}
	
	private static Long getPMod(ArrayList<Long> x) {
		
		Long sum = 0L;
		Long mult = 1L;
		long max = 0;
		Long mod = 1000000007L;
		
			for(Long d : x) {
				sum += d;
				mult =((mult % mod)*d % mod) % mod;
			}
			
		sum = modInverse(sum,mod);
		
        max = Math.max(((mult % mod)*(sum % mod)) % mod, max);
				
		return max;
	}
	
    public static long modulo(long a, long m) {
    	
        long A = (long) (a % m);
        return A >= 0 ? A : A + m;
    }
 
    public static long modInverse(long a, long m) {
    	
        a = modulo(a, m);
        return a == 0 ? 0 : modulo((1 - (long) modInverse(m % a, a) * m) / a, m);
    }
    
	public static ArrayList<ArrayList<Long>> subsets(Long[] S) {
		
		if (S == null) {
			return null;
		}
	 
		Arrays.sort(S);
	 
		ArrayList<ArrayList<Long>> result = new ArrayList<ArrayList<Long>>();
	 
		for (int i = 0; i < S.length; i++) {
			ArrayList<ArrayList<Long>> temp = new ArrayList<ArrayList<Long>>();
	 
			for (ArrayList<Long> a : result) {
				temp.add(new ArrayList<Long>(a));
			}
	 
			for (ArrayList<Long> a : temp) {
				a.add(S[i]);
			}
	 
			ArrayList<Long> single = new ArrayList<Long>();
			single.add(S[i]);
			temp.add(single);
	 
			result.addAll(temp);
		}
	 
		result.add(new ArrayList<Long>());
	 
		return result;
	}
}