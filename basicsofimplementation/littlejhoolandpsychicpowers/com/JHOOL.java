package littlejhoolandpsychicpowers.com;

import java.io.*;

public class JHOOL {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int countZeros = 0;
		int countOnes = 0;
		
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == '0') {
				countZeros++;
			} else {
				countOnes++;
			}
		}
		if (countZeros == 6 || countOnes == 6) {
			System.out.println("Sorry, sorry!");
		} else {
			System.out.println("Good luck!");
		}
	}
}