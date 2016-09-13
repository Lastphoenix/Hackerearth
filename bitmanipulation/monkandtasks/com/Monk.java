package monkandtasks.com;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

//Almost... The last Two gave TLE.

public class MONK {

	public static void main(String[] args) throws Exception {

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Desenvolvedor\\Desktop\\teste.txt"));
		int tests = Integer.parseInt(br.readLine());

		while (tests-- > 0) {

			int n = Integer.parseInt(br.readLine());
			String[] s = br.readLine().split(" ");
			BigInteger[] input = new BigInteger[n];
			Integer[] ones = new Integer[n];

			for (int i = 0; i < n; i++) {
				BigInteger x = new BigInteger(s[i]);
				input[i] = x;
				ones[i] = countOnesBinary(x);
			}
			
			List<BigInteger> bigInput = Arrays.asList(input);
			List<Integer> onesBinary = Arrays.asList(ones);
			
			concurrentSort(onesBinary, bigInput);
			
			String ans = bigInput.toString()
			.replace(",", "")  
		    .replace("[", "")  
		    .replace("]", "");
			System.out.println(ans);
		}
		br.close();
	}

	private static Integer countOnesBinary(BigInteger x) {

		Integer count = 0;

		while (x.compareTo(new BigInteger("0")) > 0) {
			count++;
			x = x.and(x.subtract(new BigInteger("1")));
		}
		return count;
	}

	public static <T extends Comparable<T>> void concurrentSort(final List<T> key, List<?>... lists) {
		
		List<Integer> indices = new ArrayList<Integer>();
		for (int i = 0; i < key.size(); i++)
			indices.add(i);

		Collections.sort(indices, new Comparator<Integer>() {
			@Override
			public int compare(Integer i, Integer j) {
				return key.get(i).compareTo(key.get(j));
			}
		});

		Map<Integer, Integer> swapMap = new HashMap<Integer, Integer>(indices.size());
		List<Integer> swapFrom = new ArrayList<Integer>(indices.size()),
				swapTo = new ArrayList<Integer>(indices.size());
		
		for (int i = 0; i < key.size(); i++) {
			int k = indices.get(i);
			while (i != k && swapMap.containsKey(k))
				k = swapMap.get(k);

			swapFrom.add(i);
			swapTo.add(k);
			swapMap.put(i, k);
		}

		for (List<?> list : lists)
			for (int i = 0; i < list.size(); i++)
				Collections.swap(list, swapFrom.get(i), swapTo.get(i));
	}
}
