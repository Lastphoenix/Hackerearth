package monkandtasks.com;

import java.util.*;

public class Monk {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int tests = sc.nextInt();

		while (tests-- > 0) {

			int n = sc.nextInt();
			int[][] arr = new int[2][n];

			for (int i = 0; i < n; i++) {
				arr[0][i] = sc.nextInt();
				arr[1][i] = countOnesBinary(arr[0][i]);
			}
			Arrays.sort(arr, new Comparator<int[]>() {
	            @Override
	            public int compare(final int[] entry1, final int[] entry2) {
	                final Integer time1 = entry1[0];
	                final Integer time2 = entry2[0];
	                return time1.compareTo(time2);
	            }
	        });
			for (final int[] s : arr) {
	            System.out.println(s[0] + " " + s[1]);
	        }
		}
		sc.close();
	}

	private static Integer countOnesBinary(int x) {

		Integer count = 0;
		
		while(x > 0){
            count++;
            x &= x - 1;
        }
		return count;
	}
}