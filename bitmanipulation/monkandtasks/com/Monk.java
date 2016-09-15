package monkandtasks.com;

import java.io.*;
import java.math.*;
import java.util.*;

public class MONK {

	final static class FastReader {

	    private final BufferedReader bufferedReader;
	    private StringTokenizer tokenizer;

	    private FastReader(final BufferedReader bufferedReader) {
	        this.bufferedReader = bufferedReader;
	        this.tokenizer = null;
	    }

	    public final static FastReader from(final InputStream inputStream) {
	        return new FastReader(new BufferedReader(new InputStreamReader(inputStream)));
	    }

	    public String next() {
	        return tokenize() ? tokenizer.nextToken() : null;
	    }

	    public boolean canReadMore() {
	        return tokenize();
	    }

	    private boolean tokenize() {
	        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
	            
	            String line = null;
	            try {
	                if ((line = bufferedReader.readLine()) == null) return false;
	            } catch (IOException unexpected) {
	                throw new RuntimeException(unexpected);
	            }
	            tokenizer = new StringTokenizer(line);
	        }
	        return true;
	    }

	    public int nextInt() {
	        return Integer.parseInt(next());
	    }

	    public long nextLong() {
	        return Long.parseLong(next());
	    }

	    public double nextDouble() {
	        return Double.parseDouble(next());
	    }

	    public BigDecimal nextBigDecimal() {
	        return new BigDecimal(next());
	    }

	    public BigInteger nextBigInteger() {
	        return new BigInteger(next());
	    }

	    public void close() {
	        try {
	            bufferedReader.close();
	        } catch (IOException unexpected) {
	            throw new RuntimeException(unexpected);
	        }
	    }
	}
	
	public static void main(String[] args) throws Exception {

		final FastReader fr = FastReader.from(System.in);
		int tests = fr.nextInt();

		while (tests-- > 0) {

			int n = fr.nextInt();
			BigInteger[] input = new BigInteger[n];
			Integer[] ones = new Integer[n];

			for (int i = 0; i < n; i++) {
				input[i] = fr.nextBigInteger();
				ones[i] = countOnesBinary(input[i]);
			}
			
			List<BigInteger> bigInput = Arrays.asList(input);
			List<Integer> onesBinary = Arrays.asList(ones);
			
			concurrentSort(onesBinary, bigInput);
			
			StringBuilder stb = new StringBuilder();
				for(BigInteger x : bigInput) {
					stb.append(x + " ");
			}
			StdOut.println(stb);
		}
		fr.close();
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

class StdOut {

    private static String charsetName = "UTF-8";

    private static PrintWriter out;

    static {
        try {
            out = new PrintWriter(new OutputStreamWriter(System.out, charsetName), true);
        }
        catch (UnsupportedEncodingException e) { System.out.println(e); }
    }

    private StdOut() { }

    public static void close() { out.close(); }

    public static void println()          { out.println();  }
    public static void println(Object x)  { out.println(x); }
    public static void println(boolean x) { out.println(x); }
    public static void println(char x)    { out.println(x); }
    public static void println(double x)  { out.println(x); }
    public static void println(float x)   { out.println(x); }
    public static void println(int x)     { out.println(x); }
    public static void println(long x)    { out.println(x); }

    public static void print(Object x)    { out.print(x);   }
    public static void print(boolean x)   { out.print(x);   }
    public static void print(char x)      { out.print(x);   }
    public static void print(double x)    { out.print(x);   }
    public static void print(float x)     { out.print(x);   }
    public static void print(int x)       { out.print(x);   }
    public static void print(long x)      { out.print(x);   }

    public static void printf(String format, Object... args) {
        out.printf(format, args);
    }
}
