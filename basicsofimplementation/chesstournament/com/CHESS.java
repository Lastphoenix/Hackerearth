package chesstournament.com;

import java.io.*;
import java.util.*;

public class CHESS {

	public static void main(String[] args) throws Exception {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		int lines = (int) Math.pow(2, N);
		int[][] triangularMatrix = new int[lines - 1][];
		int[] participants = new int[lines];
		
		for(int i = 0; i < lines; i++) {
			participants[i] = i + 1;
		}
		
		for(int i = 0; i < lines - 1; i++){
			String[] input = br.readLine().split(" ");
			triangularMatrix[i] = new int[i + 1];
			for(int j = 0; j <= i; j++) {
				triangularMatrix[i][j] = inputToInt(input, j);
			}	
		}	
		System.out.println(winner(triangularMatrix, participants, lines));
	}

	private static int winner(int[][] triangularMatrix, int[] participants, int lines) {
		
		List<Integer> list = new ArrayList<Integer>();
		int winner = 1;
		
		for(int i = 0; i < lines - 1; i++) {
			for(int j = 0; j < i; j++) {
				int value = triangularMatrix[i][j];
				if (value == 1) {
					int y = j + 1;
					list.add(participants[y]);
				} else {
					list.add(participants[j]);
				}
			}
		}
		
		System.out.println(list);
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