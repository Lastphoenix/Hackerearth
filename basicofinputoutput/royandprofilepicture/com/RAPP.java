package royandprofilepicture.com;

import java.util.Scanner;

public class RAPP {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int l = sc.nextInt();
		int photos = sc.nextInt();

		while (photos-- > 0) {

			int width = sc.nextInt();
			int height = sc.nextInt();

			if (l > width || l > height) {
				System.out.println("UPLOAD ANOTHER");
			}
			if (width >= l && height >= l) {
				if (width == height) {
					System.out.println("ACCEPTED");
				} else {
					System.out.println("CROP IT");
				}
			}
		}
		sc.close();
	}
}