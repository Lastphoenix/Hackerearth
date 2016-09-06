package palindromicstring.com;

import java.util.Scanner;

public class PalindromicString {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		
		if (isPalindrome(S)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		sc.close();
	}

	private static boolean isPalindrome(String s) {
		
		StringBuilder stb = new StringBuilder();
		for(int i = s.length() - 1; i >= 0; i--) {
			stb.append(s.charAt(i));
		}
		if (s.equals(stb.toString())) {
			return true;
		}
		return false;
	}
}