package monstersingrid;

import java.util.*;

public class MONSTERS {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int[][] grid = new int[n][m];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				grid[i][j] = sc.nextInt();
				if (grid[i][j] == 1) {
					grid[i][j] = 2;
				}
			}
		}

		monstersDied(grid, k);

		sc.close();
	}

	private static void monstersDied(int[][] grid, int k) {

		int count = 0;
		int maxvalue = 2 - k;

		while (k-- > 0) {
			for (int i = 0; i < grid.length; i++) {
				for (int j = 0; j < grid.length; j++) {
					grid[i][j] = grid[i][j] - 1;
				}
			}
		}

		for (int i = 0; i < grid.length; i++) {
			for (int j = 0; j < grid.length; j++) {
				if (grid[i][j] == maxvalue) {
					count++;
				}
			}
		}
		System.out.println(count);
	}
}