package sumofnumbers.com;

import java.io.*;
import java.util.*;

public class SUM {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {

			int n = Integer.parseInt(br.readLine());
			String line[] = br.readLine().split(" ");
			Long s = Long.parseLong(br.readLine());
			int arr[] = new int[n];
			

			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(line[i]);
			}
			
			ArrayList<ArrayList<Integer>> result = subsets(arr);
			ArrayList<Long> sums = new ArrayList<Long>();
			
			for(ArrayList<Integer> x : result){
				sums.add(getSum(x));
			}
			if (sums.contains(s)) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
	
	private static Long getSum(ArrayList<Integer> x) {
		
		long sum = 0;
		
			for(long d : x) {
				sum += d;
			}
		return sum;
	}

	public static ArrayList<ArrayList<Integer>> subsets(int[] S) {
		
		if (S == null) {
			return null;
		}
	 
		Arrays.sort(S);
	 
		ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	 
		for (int i = 0; i < S.length; i++) {
			ArrayList<ArrayList<Integer>> temp = new ArrayList<ArrayList<Integer>>();
	 
			for (ArrayList<Integer> a : result) {
				temp.add(new ArrayList<Integer>(a));
			}
	 
			for (ArrayList<Integer> a : temp) {
				a.add(S[i]);
			}
	 
			ArrayList<Integer> single = new ArrayList<Integer>();
			single.add(S[i]);
			temp.add(single);
	 
			result.addAll(temp);
		}
	 
		result.add(new ArrayList<Integer>());
	 
		return result;
	}
}