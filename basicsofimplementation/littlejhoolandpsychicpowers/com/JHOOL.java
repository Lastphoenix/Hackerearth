package littlejhoolandpsychicpowers.com;

import java.io.*;

public class JHOOL {

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();

		if (s.contains("111111") || s.contains("000000")) {
			System.out.println("Sorry, sorry!");
		} else {
			System.out.println("Good luck!");
		}
	}
}