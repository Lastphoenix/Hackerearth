package togglestring.com;

import java.io.*;

public class ToggleString {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String S = br.readLine();
		StringBuilder stb = new StringBuilder();
		for(int i = 0; i < S.length(); i++){
			if (Character.isLowerCase(S.charAt(i))) {
				stb.append(Character.toUpperCase(S.charAt(i)));
			} else {
				stb.append(Character.toLowerCase(S.charAt(i)));
			}
		}
		System.out.println(stb);
	}
}
