package theboyfriendproblems.com;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class PROBLEMS {

	public static void main(String[] args) throws Exception{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			
			int size = Integer.parseInt(br.readLine());
			String[] s = br.readLine().split(" ");
			int[] towers = new int[size];
			
			for(int i = 0; i < size - 1; i++){
				towers[i] = Integer.parseInt(s[i]);
			}
			
			Arrays.sort(towers);
			StringBuilder stb = new StringBuilder();
			
			for(int i = size - 1; i > -1; i--){
				stb.append(towers[i] + " ");
			}
			
			System.out.println(stb);
		}
	}
}