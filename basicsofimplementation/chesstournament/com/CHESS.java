package chesstournament.com;

import java.io.*;

public class CHESS {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int lines = (int) Math.pow(2, N);
		int[][] triangularMatrix = new int[lines - 1][];
	
		for(int i = 0; i < lines - 1; i++){
			String[] input = br.readLine().split(" ");
			triangularMatrix[i] = new int[i + 1];
			for(int j = 0; j <= i; j++) {
				triangularMatrix[i][j] = inputToInt(input, j);
			}	
		}	
		System.out.println(winner(triangularMatrix));
	}

	private static int winner(int[][] triangularMatrix) {
		
		int winner = 1;
		return winner;
	}

	private static int inputToInt(String[] input, int j) {
		
		int x = Integer.parseInt(input[0]);
		
		for(int i = 0; i < j; i++){
			x = Integer.parseInt(input[j]);
		}
		return x;
	}
}